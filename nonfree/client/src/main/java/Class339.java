import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tja")
public final class Class339 implements Interface13 {

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "Lclient!fq;")
	private final Class119 aClass119_1;

	@OriginalMember(owner = "client!tja", name = "f", descriptor = "Lclient!ju;")
	private final Class191 aClass191_1;

	@OriginalMember(owner = "client!tja", name = "<init>", descriptor = "(Lclient!ju;Lclient!fq;)V")
	public Class339(@OriginalArg(0) Class191 arg0, @OriginalArg(1) Class119 arg1) {
		this.aClass119_1 = arg1;
		this.aClass191_1 = arg0;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(Z)V")
	@Override
	public void method8562() {
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8561() {
		@Pc(15) Class359 local15 = this.aClass191_1.method3974(this.aClass119_1.anInt2779);
		if (local15 == null) {
			return;
		}
		@Pc(31) int local31 = this.aClass119_1.aClass112_6.method2278(Static345.anInt6198, this.aClass119_1.anInt2778) + this.aClass119_1.anInt2777;
		@Pc(46) int local46 = this.aClass119_1.aClass4_6.method49(Static427.anInt10577, this.aClass119_1.anInt2776) + this.aClass119_1.anInt2775;
		if (this.aClass119_1.aBoolean191) {
			Static563.aClass143_13.method6229(local31, local46, this.aClass119_1.anInt2778, this.aClass119_1.anInt2776, this.aClass119_1.anInt2773, 0);
		}
		local46 += this.method7824(local15.aString105, Static32.aClass72_2, local46, local31) * 12;
		local46 += 8;
		if (this.aClass119_1.aBoolean191) {
			Static563.aClass143_13.method6216(local31, local46, local31 + this.aClass119_1.anInt2778 - 1, local46, this.aClass119_1.anInt2773, 0);
		}
		local46++;
		local46 += this.method7824(local15.aString106, Static32.aClass72_2, local46, local31) * 12;
		local46 += 5;
		@Pc(129) int local129 = local46 + this.method7824(local15.aString107, Static32.aClass72_2, local46, local31) * 12;
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(ILjava/lang/String;ZLclient!da;II)I")
	private int method7824(@OriginalArg(1) String arg0, @OriginalArg(3) Class72 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return arg1.method6912(arg2 + 5, this.aClass119_1.anInt2776 + -10, arg0, 0, 0, 0, this.aClass119_1.anInt2778 - 10, 0, this.aClass119_1.anInt2772, arg3 + 5, 0, (Class1) null, (Class59[]) null, (int[]) null, this.aClass119_1.anInt2774);
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8563() {
		return this.aClass191_1.method3973();
	}
}
