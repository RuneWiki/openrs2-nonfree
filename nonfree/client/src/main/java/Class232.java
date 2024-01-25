import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class232 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "[Lclient!wa;")
	private Class176_Sub1[] aClass176_Sub1Array2;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "Lclient!md;")
	private Class2_Sub20 aClass2_Sub20_8;

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "Lclient!fn;")
	private final Class87 aClass87_2;

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "Lclient!oj;")
	private final Class179 aClass179_2;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "Lclient!li;")
	private Class2_Sub2_Sub12_Sub1 aClass2_Sub2_Sub12_Sub1_2;

	static {
		new Class256("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
	}

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!oj;Lclient!fn;)V")
	public Class232(@OriginalArg(0) Class179 arg0, @OriginalArg(1) Class87 arg1) {
		this.aClass87_2 = arg1;
		this.aClass179_2 = arg0;
		if (!this.aClass179_2.method4140()) {
			this.aClass2_Sub2_Sub12_Sub1_2 = this.aClass179_2.method4128(255, (byte) 0, true, 255);
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZILclient!oc;Lclient!oc;)Lclient!wa;")
	public Class176_Sub1 method5329(@OriginalArg(1) int arg0, @OriginalArg(2) Class175 arg1, @OriginalArg(3) Class175 arg2) {
		return this.method5330(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ZIILclient!oc;Lclient!oc;)Lclient!wa;")
	private Class176_Sub1 method5330(@OriginalArg(1) int arg0, @OriginalArg(3) Class175 arg1, @OriginalArg(4) Class175 arg2) {
		if (this.aClass2_Sub20_8 == null) {
			throw new RuntimeException();
		}
		this.aClass2_Sub20_8.anInt4608 = arg0 * 8 + 5;
		if (this.aClass2_Sub20_8.aByteArray136.length <= this.aClass2_Sub20_8.anInt4608) {
			throw new RuntimeException();
		} else if (this.aClass176_Sub1Array2[arg0] == null) {
			@Pc(45) int local45 = this.aClass2_Sub20_8.method3731();
			@Pc(50) int local50 = this.aClass2_Sub20_8.method3731();
			@Pc(69) Class176_Sub1 local69 = new Class176_Sub1(arg0, arg2, arg1, this.aClass179_2, this.aClass87_2, local45, local50, true);
			this.aClass176_Sub1Array2[arg0] = local69;
			return local69;
		} else {
			return this.aClass176_Sub1Array2[arg0];
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)Z")
	public boolean method5332() {
		if (this.aClass2_Sub20_8 != null) {
			return true;
		}
		if (this.aClass2_Sub2_Sub12_Sub1_2 == null) {
			if (this.aClass179_2.method4140()) {
				return false;
			}
			this.aClass2_Sub2_Sub12_Sub1_2 = this.aClass179_2.method4128(255, (byte) 0, true, 255);
		}
		if (this.aClass2_Sub2_Sub12_Sub1_2.aBoolean526) {
			return false;
		} else {
			this.aClass2_Sub20_8 = new Class2_Sub20(this.aClass2_Sub2_Sub12_Sub1_2.method4775());
			this.aClass176_Sub1Array2 = new Class176_Sub1[(this.aClass2_Sub20_8.aByteArray136.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V")
	public void method5334() {
		if (this.aClass176_Sub1Array2 == null) {
			return;
		}
		for (@Pc(11) int local11 = 0; local11 < this.aClass176_Sub1Array2.length; local11++) {
			if (this.aClass176_Sub1Array2[local11] != null) {
				this.aClass176_Sub1Array2[local11].method5873();
			}
		}
		for (@Pc(40) int local40 = 0; local40 < this.aClass176_Sub1Array2.length; local40++) {
			if (this.aClass176_Sub1Array2[local40] != null) {
				this.aClass176_Sub1Array2[local40].method5868();
			}
		}
	}
}
