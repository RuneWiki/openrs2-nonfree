import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class353 implements Interface7 {

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "Lclient!lp;")
	private final Class229 aClass229_1;

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "Lclient!nt;")
	private final Class255 aClass255_2;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!nt;Lclient!lp;)V")
	public Class353(@OriginalArg(0) Class255 arg0, @OriginalArg(1) Class229 arg1) {
		this.aClass229_1 = arg1;
		this.aClass255_2 = arg0;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(I)V")
	@Override
	public void method7986() {
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7985() {
		@Pc(16) Class14 local16 = this.aClass255_2.method5810(this.aClass229_1.anInt6264);
		if (local16 == null) {
			return;
		}
		@Pc(33) int local33 = this.aClass229_1.aClass92_10.method2199(Static507.anInt8484, this.aClass229_1.anInt6255) + this.aClass229_1.anInt6262;
		@Pc(47) int local47 = this.aClass229_1.aClass65_13.method1786(Static581.anInt9218, this.aClass229_1.anInt6259) + this.aClass229_1.anInt6253;
		if (this.aClass229_1.aBoolean480) {
			Static582.aClass16_12.method8146(local33, local47, this.aClass229_1.anInt6255, this.aClass229_1.anInt6259, this.aClass229_1.anInt6258, 0);
		}
		local47 += this.method7988(local47, local33, local16.aString3, Static243.aClass69_5) * 12;
		local47 += 8;
		if (this.aClass229_1.aBoolean480) {
			Static582.aClass16_12.method8140(local33, local47, this.aClass229_1.anInt6255 + local33 - 1, local47, this.aClass229_1.anInt6258, 0);
		}
		local47++;
		local47 += this.method7988(local47, local33, local16.aString4, Static243.aClass69_5) * 12;
		local47 += 5;
		@Pc(129) int local129 = local47 + this.method7988(local47, local33, local16.aString2, Static243.aClass69_5) * 12;
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method7984() {
		return this.aClass255_2.method5811();
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IIIBLjava/lang/String;Lclient!da;)I")
	private int method7988(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) String arg2, @OriginalArg(5) Class69 arg3) {
		return arg3.method7452(arg2, arg0 + 5, 0, this.aClass229_1.anInt6255 - 10, (Class1) null, 0, 0, 0, this.aClass229_1.anInt6259 - 10, 0, this.aClass229_1.anInt6261, (int[]) null, (Class102[]) null, arg1 + 5, this.aClass229_1.anInt6254);
	}
}
