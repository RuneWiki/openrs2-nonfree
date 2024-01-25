import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tv")
public final class Class2_Sub6_Sub21 extends Class2_Sub6 {

	@OriginalMember(owner = "client!tv", name = "w", descriptor = "[I")
	public static final int[] anIntArray701 = new int[32];

	@OriginalMember(owner = "client!tv", name = "H", descriptor = "I")
	public int anInt9640 = 12800;

	@OriginalMember(owner = "client!tv", name = "y", descriptor = "Z")
	public boolean aBoolean832 = true;

	@OriginalMember(owner = "client!tv", name = "J", descriptor = "I")
	public int anInt9647 = 12800;

	@OriginalMember(owner = "client!tv", name = "P", descriptor = "I")
	public int anInt9643 = 0;

	@OriginalMember(owner = "client!tv", name = "S", descriptor = "I")
	public int anInt9646 = -1;

	@OriginalMember(owner = "client!tv", name = "G", descriptor = "I")
	public int anInt9653 = 0;

	@OriginalMember(owner = "client!tv", name = "A", descriptor = "I")
	public int anInt9654 = -1;

	@OriginalMember(owner = "client!tv", name = "M", descriptor = "Ljava/lang/String;")
	public final String aString109;

	@OriginalMember(owner = "client!tv", name = "K", descriptor = "Ljava/lang/String;")
	public final String aString110;

	@OriginalMember(owner = "client!tv", name = "F", descriptor = "I")
	public final int anInt9639;

	@OriginalMember(owner = "client!tv", name = "x", descriptor = "I")
	public final int anInt9651;

	@OriginalMember(owner = "client!tv", name = "Q", descriptor = "Lclient!cga;")
	public final Class60 aClass60_199;

	static {
		@Pc(85) int local85 = 2;
		for (@Pc(87) int local87 = 0; local87 < 32; local87++) {
			anIntArray701[local87] = local85 - 1;
			local85 += local85;
		}
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
	public Class2_Sub6_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aBoolean832 = arg5;
		this.aString109 = arg2;
		this.anInt9646 = arg6;
		this.aString110 = arg1;
		this.anInt9654 = arg4;
		this.anInt9639 = arg3;
		this.anInt9651 = arg0;
		if (this.anInt9646 == 255) {
			this.anInt9646 = 0;
		}
		this.aClass60_199 = new Class60();
	}

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "(I)V")
	public void method8512() {
		this.anInt9640 = 12800;
		this.anInt9643 = 0;
		this.anInt9653 = 0;
		this.anInt9647 = 12800;
		for (@Pc(31) Class2_Sub54 local31 = (Class2_Sub54) this.aClass60_199.method1226(7); local31 != null; local31 = (Class2_Sub54) this.aClass60_199.method1228()) {
			if (local31.anInt10660 > this.anInt9643) {
				this.anInt9643 = local31.anInt10660;
			}
			if (local31.anInt10662 < this.anInt9647) {
				this.anInt9647 = local31.anInt10662;
			}
			if (local31.anInt10668 < this.anInt9640) {
				this.anInt9640 = local31.anInt10668;
			}
			if (local31.anInt10674 > this.anInt9653) {
				this.anInt9653 = local31.anInt10674;
			}
		}
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I[III)Z")
	public boolean method8514(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		for (@Pc(11) Class2_Sub54 local11 = (Class2_Sub54) this.aClass60_199.method1226(7); local11 != null; local11 = (Class2_Sub54) this.aClass60_199.method1228()) {
			if (local11.method9344(arg2, arg0)) {
				local11.method9341(arg1, arg2, arg0);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[II)Z")
	public boolean method8515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		for (@Pc(18) Class2_Sub54 local18 = (Class2_Sub54) this.aClass60_199.method1226(7); local18 != null; local18 = (Class2_Sub54) this.aClass60_199.method1228()) {
			if (local18.method9342(arg1, arg3, arg0)) {
				local18.method9338(arg1, arg3, arg2);
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(III[I)Z")
	public boolean method8516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		for (@Pc(11) Class2_Sub54 local11 = (Class2_Sub54) this.aClass60_199.method1226(7); local11 != null; local11 = (Class2_Sub54) this.aClass60_199.method1228()) {
			if (local11.method9340(arg2, arg1)) {
				local11.method9338(arg1, arg2, arg3);
				return true;
			}
		}
		return arg0 < 54;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(IIB)Z")
	public boolean method8517(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		for (@Pc(11) Class2_Sub54 local11 = (Class2_Sub54) this.aClass60_199.method1226(7); local11 != null; local11 = (Class2_Sub54) this.aClass60_199.method1228()) {
			if (local11.method9340(arg0, arg1)) {
				return true;
			}
		}
		return false;
	}
}
