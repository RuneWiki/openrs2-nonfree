import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class4_Sub2_Sub1 extends Class4_Sub2 {

	@OriginalMember(owner = "client!og", name = "T", descriptor = "I")
	public final int anInt6596;

	@OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
	public final int anInt6595;

	@OriginalMember(owner = "client!og", name = "U", descriptor = "F")
	public final float aFloat278;

	@OriginalMember(owner = "client!og", name = "R", descriptor = "F")
	public final float aFloat277;

	@OriginalMember(owner = "client!og", name = "O", descriptor = "Z")
	public final boolean aBoolean457;

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!jj;IIIII[BI)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt6596 = arg2;
		this.anInt6595 = arg3;
		this.method5465(arg6, arg2, true, arg3, arg7);
		this.aFloat278 = (float) arg2 / (float) arg4;
		this.aFloat277 = (float) arg3 / (float) arg5;
		this.aBoolean457 = false;
		this.method5467(false, false);
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!jj;IIIZ[I)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt6596 = arg2;
		if (super.anInt6708 == 34037) {
			this.aFloat278 = arg2;
			this.aFloat277 = arg3;
			this.aBoolean457 = false;
		} else {
			this.aBoolean457 = true;
			this.aFloat278 = this.aFloat277 = 1.0F;
		}
		this.anInt6595 = arg3;
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!jj;IIIIIZ)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt6596 = arg4;
		if (super.anInt6708 == 34037) {
			this.aFloat278 = arg4;
			this.aBoolean457 = false;
			this.aFloat277 = arg5;
		} else {
			this.aBoolean457 = true;
			this.aFloat278 = this.aFloat277 = 1.0F;
		}
		this.anInt6595 = arg5;
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!jj;IIIIIIZ)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aFloat277 = (float) arg4 / (float) arg6;
		this.aBoolean457 = false;
		this.anInt6596 = arg3;
		this.aFloat278 = (float) arg3 / (float) arg5;
		this.anInt6595 = arg4;
		this.method5467(false, false);
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!jj;IIII[I)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt6595 = arg2;
		this.anInt6596 = arg1;
		this.method5468(arg5, arg1, arg2);
		this.aFloat278 = (float) arg1 / (float) arg3;
		this.aFloat277 = (float) arg2 / (float) arg4;
		this.aBoolean457 = false;
		this.method5467(false, false);
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lclient!jj;IIIIZ[BI)V")
	public Class4_Sub2_Sub1(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		if (super.anInt6708 == 34037) {
			this.aFloat278 = arg3;
			this.aBoolean457 = false;
			this.aFloat277 = arg4;
		} else {
			this.aBoolean457 = true;
			this.aFloat278 = this.aFloat277 = 1.0F;
		}
		this.anInt6596 = arg3;
		this.anInt6595 = arg4;
	}
}
