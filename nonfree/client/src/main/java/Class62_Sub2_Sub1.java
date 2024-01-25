import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class62_Sub2_Sub1 extends Class62_Sub2 {

	@OriginalMember(owner = "client!hf", name = "bb", descriptor = "I")
	public final int anInt3028;

	@OriginalMember(owner = "client!hf", name = "X", descriptor = "F")
	public final float aFloat61;

	@OriginalMember(owner = "client!hf", name = "T", descriptor = "F")
	public final float aFloat60;

	@OriginalMember(owner = "client!hf", name = "W", descriptor = "Z")
	public final boolean aBoolean198;

	@OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
	public final int anInt3025;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!bt;IIIZ[I)V")
	public Class62_Sub2_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt3028 = arg3;
		if (super.anInt6644 == 34037) {
			this.aFloat61 = arg2;
			this.aFloat60 = arg3;
			this.aBoolean198 = false;
		} else {
			this.aBoolean198 = true;
			this.aFloat61 = this.aFloat60 = 1.0F;
		}
		this.anInt3025 = arg2;
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!bt;IIIIIIZ)V")
	public Class62_Sub2_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat61 = (float) arg3 / (float) arg5;
		this.aBoolean198 = false;
		this.anInt3028 = arg4;
		this.aFloat60 = (float) arg4 / (float) arg6;
		this.anInt3025 = arg3;
		this.method2681(false, false);
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!bt;IIIII[BI)V")
	public Class62_Sub2_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3028 = arg3;
		this.anInt3025 = arg2;
		this.method2687(arg2, arg7, true, arg3, arg6);
		this.aBoolean198 = false;
		this.aFloat61 = (float) arg2 / (float) arg4;
		this.aFloat60 = (float) arg3 / (float) arg5;
		this.method2681(false, false);
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!bt;IIIIIZ)V")
	public Class62_Sub2_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		if (super.anInt6644 == 34037) {
			this.aBoolean198 = false;
			this.aFloat61 = arg4;
			this.aFloat60 = arg5;
		} else {
			this.aFloat61 = this.aFloat60 = 1.0F;
			this.aBoolean198 = true;
		}
		this.anInt3028 = arg5;
		this.anInt3025 = arg4;
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!bt;IIIIZ[BI)V")
	public Class62_Sub2_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt6644 == 34037) {
			this.aFloat60 = arg4;
			this.aBoolean198 = false;
			this.aFloat61 = arg3;
		} else {
			this.aFloat61 = this.aFloat60 = 1.0F;
			this.aBoolean198 = true;
		}
		this.anInt3028 = arg4;
		this.anInt3025 = arg3;
	}

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lclient!bt;IIII[I)V")
	public Class62_Sub2_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3025 = arg1;
		this.anInt3028 = arg2;
		this.method2682(arg2, arg5, arg1);
		this.aFloat61 = (float) arg1 / (float) arg3;
		this.aBoolean198 = false;
		this.aFloat60 = (float) arg2 / (float) arg4;
		this.method2681(false, false);
	}
}
