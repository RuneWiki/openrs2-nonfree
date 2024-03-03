import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public final class Class135 {

	@OriginalMember(owner = "client!ld", name = "n", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1;

	@OriginalMember(owner = "client!ld", name = "k", descriptor = "Lclient!ag;")
	private Class2 aClass2_131;

	@OriginalMember(owner = "client!ld", name = "i", descriptor = "Lclient!ag;")
	public final Class2 aClass2_130 = new Class2();

	static {
		new Class79("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
		aBigInteger1 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
	}

	@OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 240)
	public Class135() {
		this.aClass2_130.aClass2_244 = this.aClass2_130;
		this.aClass2_130.aClass2_243 = this.aClass2_130;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ag;B)V", line = 16)
	public void method3541(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_244 != null) {
			arg0.method6469();
		}
		arg0.aClass2_243 = this.aClass2_130;
		arg0.aClass2_244 = this.aClass2_130.aClass2_244;
		arg0.aClass2_244.aClass2_243 = arg0;
		arg0.aClass2_243.aClass2_244 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ld;I)V", line = 52)
	public void method3543(@OriginalArg(0) Class135 arg0) {
		this.method3547(arg0, this.aClass2_130.aClass2_243);
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)I", line = 66)
	public int method3544() {
		@Pc(11) int local11 = 0;
		@Pc(15) Class2 local15 = this.aClass2_130.aClass2_243;
		while (this.aClass2_130 != local15) {
			local15 = local15.aClass2_243;
			local11++;
		}
		return local11;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V", line = 87)
	public void method3545() {
		while (true) {
			@Pc(5) Class2 local5 = this.aClass2_130.aClass2_243;
			if (local5 == this.aClass2_130) {
				this.aClass2_131 = null;
				return;
			}
			local5.method6469();
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!ag;)V", line = 111)
	public void method3546(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_244 != null) {
			arg0.method6469();
		}
		arg0.aClass2_243 = this.aClass2_130.aClass2_243;
		arg0.aClass2_244 = this.aClass2_130;
		arg0.aClass2_244.aClass2_243 = arg0;
		arg0.aClass2_243.aClass2_244 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!ld;BLclient!ag;)V", line = 130)
	private void method3547(@OriginalArg(0) Class135 arg0, @OriginalArg(2) Class2 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_130.aClass2_244;
		this.aClass2_130.aClass2_244 = arg1.aClass2_244;
		arg1.aClass2_244.aClass2_243 = this.aClass2_130;
		if (arg1 != this.aClass2_130) {
			arg1.aClass2_244 = arg0.aClass2_130.aClass2_244;
			arg1.aClass2_244.aClass2_243 = arg1;
			arg0.aClass2_130.aClass2_244 = local7;
			local7.aClass2_243 = arg0.aClass2_130;
		}
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)Lclient!ag;", line = 153)
	public Class2 method3548() {
		@Pc(6) Class2 local6 = this.aClass2_131;
		if (this.aClass2_130 == local6) {
			this.aClass2_131 = null;
			return null;
		} else {
			this.aClass2_131 = local6.aClass2_244;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)Lclient!ag;", line = 175)
	public Class2 method3549() {
		@Pc(12) Class2 local12 = this.aClass2_130.aClass2_244;
		if (local12 == this.aClass2_130) {
			this.aClass2_131 = null;
			return null;
		} else {
			this.aClass2_131 = local12.aClass2_244;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(B)Lclient!ag;", line = 198)
	public Class2 method3550() {
		@Pc(7) Class2 local7 = this.aClass2_130.aClass2_243;
		if (this.aClass2_130 == local7) {
			return null;
		} else {
			local7.method6469();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ld", name = "e", descriptor = "(B)Z", line = 222)
	public boolean method3551() {
		return this.aClass2_130 == this.aClass2_130.aClass2_243;
	}

	@OriginalMember(owner = "client!ld", name = "f", descriptor = "(B)Lclient!ag;", line = 249)
	public Class2 method3552() {
		@Pc(14) Class2 local14 = this.aClass2_130.aClass2_243;
		if (local14 == this.aClass2_130) {
			this.aClass2_131 = null;
			return null;
		} else {
			this.aClass2_131 = local14.aClass2_243;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "(I)Lclient!ag;", line = 274)
	public Class2 method3553() {
		@Pc(13) Class2 local13 = this.aClass2_131;
		if (local13 == this.aClass2_130) {
			this.aClass2_131 = null;
			return null;
		} else {
			this.aClass2_131 = local13.aClass2_243;
			return local13;
		}
	}
}
