import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public final class Class8_Sub1_Sub1 extends Class8_Sub1 {

	@OriginalMember(owner = "client!ln", name = "n", descriptor = "I")
	public final int anInt3684;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "I")
	public final int anInt3683;

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "F")
	public final float aFloat42;

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "F")
	public final float aFloat41;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "Z")
	public final boolean aBoolean237;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!bf;IIII[I)V", line = 4)
	public Class8_Sub1_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, 3553, 6408, arg3, arg4);
		this.anInt3684 = arg1;
		this.anInt3683 = arg2;
		this.method3638(arg1, arg2, arg5);
		this.aFloat42 = (float) arg2 / (float) arg4;
		this.aFloat41 = (float) arg1 / (float) arg3;
		this.aBoolean237 = false;
		this.method3639(false, false);
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!bf;IIIIIIZ)V", line = 38)
	public Class8_Sub1_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		super(arg0, 3553, arg1, arg2, arg5, arg6);
		this.aBoolean237 = false;
		this.aFloat42 = (float) arg4 / (float) arg6;
		this.aFloat41 = (float) arg3 / (float) arg5;
		this.anInt3683 = arg4;
		this.anInt3684 = arg3;
		this.method3639(false, false);
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!bf;IIIZ[I)V", line = 51)
	public Class8_Sub1_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int[] arg5) {
		super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
		this.anInt3684 = arg2;
		if (this.anInt6869 == 34037) {
			this.aFloat42 = arg3;
			this.aFloat41 = arg2;
			this.aBoolean237 = false;
		} else {
			this.aBoolean237 = true;
			this.aFloat41 = this.aFloat42 = 1.0F;
		}
		this.anInt3683 = arg3;
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!bf;IIIIIZ)V", line = 72)
	public Class8_Sub1_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		super(arg0, arg1, arg2, arg3, arg4, arg5);
		this.anInt3684 = arg4;
		this.anInt3683 = arg5;
		if (this.anInt6869 == 34037) {
			this.aFloat41 = arg4;
			this.aBoolean237 = false;
			this.aFloat42 = arg5;
		} else {
			this.aFloat41 = this.aFloat42 = 1.0F;
			this.aBoolean237 = true;
		}
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!bf;IIIIZ[BI)V", line = 93)
	public Class8_Sub1_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
		this.anInt3683 = arg4;
		if (this.anInt6869 == 34037) {
			this.aFloat42 = arg4;
			this.aFloat41 = arg3;
			this.aBoolean237 = false;
		} else {
			this.aFloat41 = this.aFloat42 = 1.0F;
			this.aBoolean237 = true;
		}
		this.anInt3684 = arg3;
	}

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!bf;IIIII[BI)V", line = 155)
	public Class8_Sub1_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7) {
		super(arg0, 3553, arg1, arg4, arg5);
		this.anInt3684 = arg2;
		this.anInt3683 = arg3;
		this.method3636(arg2, arg3, arg6, arg7, true);
		this.aBoolean237 = false;
		this.aFloat41 = (float) arg2 / (float) arg4;
		this.aFloat42 = (float) arg3 / (float) arg5;
		this.method3639(false, false);
	}
}
