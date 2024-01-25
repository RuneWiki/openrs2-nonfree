import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public final class Class32_Sub1_Sub1 extends Class32_Sub1 {

	@OriginalMember(owner = "client!gda", name = "N", descriptor = "I")
	public final int anInt3112;

	@OriginalMember(owner = "client!gda", name = "L", descriptor = "F")
	public final float aFloat52;

	@OriginalMember(owner = "client!gda", name = "P", descriptor = "F")
	public final float aFloat53;

	@OriginalMember(owner = "client!gda", name = "J", descriptor = "I")
	public final int anInt3115;

	@OriginalMember(owner = "client!gda", name = "I", descriptor = "Z")
	public final boolean aBoolean256;

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ffa;IIIII)V")
	public Class32_Sub1_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3112 = arg3;
		this.aFloat52 = (float) arg3 / (float) arg5;
		this.aFloat53 = (float) arg2 / (float) arg4;
		this.anInt3115 = arg2;
		this.aBoolean256 = false;
		this.method2721(false, false);
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ffa;IIIIZ[BI)V")
	public Class32_Sub1_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3112 = arg4;
		this.anInt3115 = arg3;
		if (super.anInt9813 == 34037) {
			this.aFloat52 = (float) arg4;
			this.aFloat53 = (float) arg3;
			this.aBoolean256 = false;
		} else {
			this.aBoolean256 = true;
			this.aFloat53 = this.aFloat52 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ffa;IIIIIIZ)V")
	public Class32_Sub1_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt3115 = arg3;
		this.aFloat53 = (float) arg3 / (float) arg5;
		this.aFloat52 = (float) arg4 / (float) arg6;
		this.aBoolean256 = false;
		this.anInt3112 = arg4;
		this.method2721(false, false);
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ffa;IIII)V")
	public Class32_Sub1_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt3115 = arg3;
		this.anInt3112 = arg4;
		if (super.anInt9813 == 34037) {
			this.aFloat52 = (float) arg4;
			this.aFloat53 = (float) arg3;
			this.aBoolean256 = false;
		} else {
			this.aBoolean256 = true;
			this.aFloat53 = this.aFloat52 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ffa;IIIIIZ)V")
	public Class32_Sub1_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt3112 = arg5;
		this.anInt3115 = arg4;
		if (super.anInt9813 == 34037) {
			this.aFloat52 = (float) arg5;
			this.aBoolean256 = false;
			this.aFloat53 = (float) arg4;
		} else {
			this.aBoolean256 = true;
			this.aFloat53 = this.aFloat52 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ffa;IIIII[BI)V")
	public Class32_Sub1_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3115 = arg2;
		this.anInt3112 = arg3;
		this.method2724(arg6, arg7, true, arg3, arg2);
		this.aBoolean256 = false;
		this.aFloat52 = (float) arg3 / (float) arg5;
		this.aFloat53 = (float) arg2 / (float) arg4;
		this.method2721(false, false);
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ffa;IIIZ[III)V")
	public Class32_Sub1_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt9813 == 34037) {
			this.aBoolean256 = false;
			this.aFloat53 = (float) arg2;
			this.aFloat52 = (float) arg3;
		} else {
			this.aFloat53 = this.aFloat52 = 1.0F;
			this.aBoolean256 = true;
		}
		this.anInt3112 = arg3;
		this.anInt3115 = arg2;
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!ffa;IIII[I)V")
	public Class32_Sub1_Sub1(@OriginalArg(0) Class57_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3115 = arg1;
		this.anInt3112 = arg2;
		this.method2723(arg2, arg1, 0, arg5, 0, 0);
		this.aFloat52 = (float) arg2 / (float) arg4;
		this.aBoolean256 = false;
		this.aFloat53 = (float) arg1 / (float) arg3;
		this.method2721(false, false);
	}
}
