import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class107 {

	@OriginalMember(owner = "client!ih", name = "b", descriptor = "[Lclient!hn;")
	private Class101_Sub1[] aClass101_Sub1Array1;

	@OriginalMember(owner = "client!ih", name = "h", descriptor = "Lclient!nj;")
	private Class3_Sub25 aClass3_Sub25_4;

	@OriginalMember(owner = "client!ih", name = "s", descriptor = "Lclient!pq;")
	private final Class191 aClass191_2;

	@OriginalMember(owner = "client!ih", name = "p", descriptor = "Lclient!qc;")
	private final Class196 aClass196_2;

	@OriginalMember(owner = "client!ih", name = "l", descriptor = "Lclient!hk;")
	private Class3_Sub3_Sub11_Sub1 aClass3_Sub3_Sub11_Sub1_1;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(Lclient!pq;Lclient!qc;)V")
	public Class107(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class196 arg1) {
		this.aClass191_2 = arg0;
		this.aClass196_2 = arg1;
		if (!this.aClass191_2.method4500()) {
			this.aClass3_Sub3_Sub11_Sub1_1 = this.aClass191_2.method4504(true, (byte) 0, 255, 255);
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)Z")
	public boolean method2616() {
		if (this.aClass3_Sub25_4 != null) {
			return true;
		}
		if (this.aClass3_Sub3_Sub11_Sub1_1 == null) {
			if (this.aClass191_2.method4500()) {
				return false;
			}
			this.aClass3_Sub3_Sub11_Sub1_1 = this.aClass191_2.method4504(true, (byte) 0, 255, 255);
		}
		if (this.aClass3_Sub3_Sub11_Sub1_1.aBoolean437) {
			return false;
		} else {
			this.aClass3_Sub25_4 = new Class3_Sub25(this.aClass3_Sub3_Sub11_Sub1_1.method5280());
			this.aClass101_Sub1Array1 = new Class101_Sub1[(this.aClass3_Sub25_4.aByteArray88.length - 5) / 8];
			return true;
		}
	}

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V")
	public void method2620() {
		if (this.aClass101_Sub1Array1 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.aClass101_Sub1Array1.length; local16++) {
			if (this.aClass101_Sub1Array1[local16] != null) {
				this.aClass101_Sub1Array1[local16].method2464();
			}
		}
		for (@Pc(37) int local37 = 0; local37 < this.aClass101_Sub1Array1.length; local37++) {
			if (this.aClass101_Sub1Array1[local37] != null) {
				this.aClass101_Sub1Array1[local37].method2463();
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILclient!vc;ZLclient!vc;B)Lclient!hn;")
	private Class101_Sub1 method2621(@OriginalArg(0) int arg0, @OriginalArg(1) Class253 arg1, @OriginalArg(3) Class253 arg2) {
		if (this.aClass3_Sub25_4 == null) {
			throw new RuntimeException();
		}
		this.aClass3_Sub25_4.anInt4974 = arg0 * 8 + 5;
		if (this.aClass3_Sub25_4.aByteArray88.length <= this.aClass3_Sub25_4.anInt4974) {
			throw new RuntimeException();
		} else if (this.aClass101_Sub1Array1[arg0] == null) {
			@Pc(54) int local54 = this.aClass3_Sub25_4.method4108();
			@Pc(59) int local59 = this.aClass3_Sub25_4.method4108();
			@Pc(73) Class101_Sub1 local73 = new Class101_Sub1(arg0, arg2, arg1, this.aClass191_2, this.aClass196_2, local54, local59, true);
			this.aClass101_Sub1Array1[arg0] = local73;
			return local73;
		} else {
			return this.aClass101_Sub1Array1[arg0];
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(Lclient!vc;ILclient!vc;I)Lclient!hn;")
	public Class101_Sub1 method2622(@OriginalArg(0) Class253 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class253 arg2) {
		return this.method2621(arg1, arg0, arg2);
	}
}
