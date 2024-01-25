import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class1_Sub3_Sub1 extends Class1_Sub3 {

	@OriginalMember(owner = "client!og", name = "S", descriptor = "I")
	public final int anInt5180;

	@OriginalMember(owner = "client!og", name = "X", descriptor = "I")
	public final int anInt5182;

	@OriginalMember(owner = "client!og", name = "W", descriptor = "Z")
	public final boolean aBoolean354;

	@OriginalMember(owner = "client!og", name = "T", descriptor = "F")
	public final float aFloat143;

	@OriginalMember(owner = "client!og", name = "Z", descriptor = "F")
	public final float aFloat144;

	static {
		new Class242("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!bv;IIII[I)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt5180 = arg2;
		this.anInt5182 = arg1;
		this.method3968(arg2, arg5, arg1);
		this.aBoolean354 = false;
		this.aFloat143 = (float) arg2 / (float) arg4;
		this.aFloat144 = (float) arg1 / (float) arg3;
		this.method3964(false, false);
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!bv;IIIIIZ)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt5182 = arg4;
		this.anInt5180 = arg5;
		if (super.anInt5564 == 34037) {
			this.aFloat144 = arg4;
			this.aBoolean354 = false;
			this.aFloat143 = arg5;
		} else {
			this.aBoolean354 = true;
			this.aFloat144 = this.aFloat143 = 1.0F;
		}
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!bv;IIIII[BI)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt5180 = arg3;
		this.anInt5182 = arg2;
		this.method3969(arg6, arg7, arg2, true, arg3);
		this.aFloat143 = (float) arg3 / (float) arg5;
		this.aFloat144 = (float) arg2 / (float) arg4;
		this.aBoolean354 = false;
		this.method3964(false, false);
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!bv;IIIIZ[BI)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt5182 = arg3;
		if (super.anInt5564 == 34037) {
			this.aBoolean354 = false;
			this.aFloat144 = arg3;
			this.aFloat143 = arg4;
		} else {
			this.aBoolean354 = true;
			this.aFloat144 = this.aFloat143 = 1.0F;
		}
		this.anInt5180 = arg4;
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!bv;IIIIIIZ)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.anInt5180 = arg4;
		this.aFloat144 = (float) arg3 / (float) arg5;
		this.aFloat143 = (float) arg4 / (float) arg6;
		this.aBoolean354 = false;
		this.anInt5182 = arg3;
		this.method3964(false, false);
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!bv;IIIZ[I)V")
	public Class1_Sub3_Sub1(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt5180 = arg3;
		this.anInt5182 = arg2;
		if (super.anInt5564 == 34037) {
			this.aFloat144 = arg2;
			this.aFloat143 = arg3;
			this.aBoolean354 = false;
		} else {
			this.aFloat144 = this.aFloat143 = 1.0F;
			this.aBoolean354 = true;
		}
	}
}
