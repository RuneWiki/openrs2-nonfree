import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nt")
public final class Class168 {

	@OriginalMember(owner = "client!nt", name = "i", descriptor = "[Lclient!nh;")
	private Class56_Sub1[] aClass56_Sub1Array2;

	@OriginalMember(owner = "client!nt", name = "l", descriptor = "Lclient!re;")
	private Class1_Sub33 aClass1_Sub33_7;

	@OriginalMember(owner = "client!nt", name = "j", descriptor = "Lclient!gm;")
	private final Class92 aClass92_3;

	@OriginalMember(owner = "client!nt", name = "c", descriptor = "Lclient!wo;")
	private final Class250 aClass250_3;

	@OriginalMember(owner = "client!nt", name = "h", descriptor = "Lclient!ml;")
	private Class1_Sub6_Sub10_Sub1 aClass1_Sub6_Sub10_Sub1_2;

	@OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lclient!gm;Lclient!wo;)V")
	public Class168(@OriginalArg(0) Class92 arg0, @OriginalArg(1) Class250 arg1) {
		this.aClass92_3 = arg0;
		this.aClass250_3 = arg1;
		if (!this.aClass92_3.method1780()) {
			this.aClass1_Sub6_Sub10_Sub1_2 = this.aClass92_3.method1785(true, (byte) 0, 255, 255);
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
	public void method3671() {
		if (this.aClass56_Sub1Array2 == null) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < this.aClass56_Sub1Array2.length; local22++) {
			if (this.aClass56_Sub1Array2[local22] != null) {
				this.aClass56_Sub1Array2[local22].method3297();
			}
		}
		for (@Pc(47) int local47 = 0; local47 < this.aClass56_Sub1Array2.length; local47++) {
			if (this.aClass56_Sub1Array2[local47] != null) {
				this.aClass56_Sub1Array2[local47].method3304();
			}
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZLclient!ce;ILclient!ce;I)Lclient!nh;")
	private Class56_Sub1 method3673(@OriginalArg(1) Class38 arg0, @OriginalArg(3) Class38 arg1, @OriginalArg(4) int arg2) {
		if (this.aClass1_Sub33_7 == null) {
			throw new RuntimeException();
		}
		this.aClass1_Sub33_7.lb = arg2 * 8 + 5;
		if (this.aClass1_Sub33_7.aByteArray86.length <= this.aClass1_Sub33_7.lb) {
			throw new RuntimeException();
		} else if (this.aClass56_Sub1Array2[arg2] == null) {
			@Pc(49) int local49 = this.aClass1_Sub33_7.method5150();
			@Pc(54) int local54 = this.aClass1_Sub33_7.method5150();
			@Pc(68) Class56_Sub1 local68 = new Class56_Sub1(arg2, arg1, arg0, this.aClass92_3, this.aClass250_3, local49, local54, true);
			this.aClass56_Sub1Array2[arg2] = local68;
			return local68;
		} else {
			return this.aClass56_Sub1Array2[arg2];
		}
	}

	@OriginalMember(owner = "client!nt", name = "b", descriptor = "(B)Z")
	public boolean method3676() {
		if (this.aClass1_Sub33_7 != null) {
			return true;
		}
		if (this.aClass1_Sub6_Sub10_Sub1_2 == null) {
			if (this.aClass92_3.method1780()) {
				return false;
			}
			this.aClass1_Sub6_Sub10_Sub1_2 = this.aClass92_3.method1785(true, (byte) 0, 255, 255);
		}
		if (this.aClass1_Sub6_Sub10_Sub1_2.aBoolean595) {
			return false;
		} else {
			this.aClass1_Sub33_7 = new Class1_Sub33(this.aClass1_Sub6_Sub10_Sub1_2.method5582());
			this.aClass56_Sub1Array2 = new Class56_Sub1[(this.aClass1_Sub33_7.aByteArray86.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lclient!ce;BILclient!ce;)Lclient!nh;")
	public Class56_Sub1 method3677(@OriginalArg(0) Class38 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class38 arg2) {
		return this.method3673(arg2, arg0, arg1);
	}
}
