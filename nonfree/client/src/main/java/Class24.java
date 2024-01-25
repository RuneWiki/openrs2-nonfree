import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!baa")
public final class Class24 implements Interface6 {

	@OriginalMember(owner = "client!baa", name = "j", descriptor = "Lclient!cga;")
	private final Class48 aClass48_1;

	@OriginalMember(owner = "client!baa", name = "e", descriptor = "Lclient!fda;")
	private final Class96 aClass96_1;

	@OriginalMember(owner = "client!baa", name = "<init>", descriptor = "(Lclient!cga;Lclient!fda;)V")
	public Class24(@OriginalArg(0) Class48 arg0, @OriginalArg(1) Class96 arg1) {
		this.aClass48_1 = arg0;
		this.aClass96_1 = arg1;
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method6805() {
		return this.aClass48_1.method1435();
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(I)V")
	@Override
	public void method6804() {
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(Lclient!la;ILjava/lang/String;BII)I")
	private int method781(@OriginalArg(0) Class35 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) String arg2, @OriginalArg(5) int arg3) {
		return arg0.method4952(this.aClass96_1.anInt2704 - 10, arg1 + 5, null, arg2, null, 0, 0, 0, this.aClass96_1.anInt2707 - 10, 0, this.aClass96_1.anInt2703, null, arg3 + 5, this.aClass96_1.anInt2702, 0);
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6803() {
		@Pc(18) Class4 local18 = this.aClass48_1.method1431(this.aClass96_1.anInt2706);
		if (local18 == null) {
			return;
		}
		@Pc(35) int local35 = this.aClass96_1.aClass314_3.method7035(this.aClass96_1.anInt2704, Static483.anInt8133) + this.aClass96_1.anInt2705;
		@Pc(49) int local49 = this.aClass96_1.aClass103_7.method2391(this.aClass96_1.anInt2707, Static443.anInt7712) + this.aClass96_1.anInt2701;
		if (this.aClass96_1.aBoolean196) {
			Static136.aClass12_8.method6435(local35, local49, this.aClass96_1.anInt2704, this.aClass96_1.anInt2707, this.aClass96_1.anInt2709, 0);
		}
		local49 += this.method781(Static260.aClass35_7, local49, local18.aString5, local35) * 12;
		local49 += 8;
		if (this.aClass96_1.aBoolean196) {
			Static136.aClass12_8.method6468(local35, local49, local35 + this.aClass96_1.anInt2704 - 1, local49, this.aClass96_1.anInt2709, 0);
		}
		local49++;
		local49 += this.method781(Static260.aClass35_7, local49, local18.aString3, local35) * 12;
		local49 += 5;
		@Pc(131) int local131 = local49 + this.method781(Static260.aClass35_7, local49, local18.aString4, local35) * 12;
	}
}
