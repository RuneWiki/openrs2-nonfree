import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iq")
public final class Class150 implements Interface15 {

	@OriginalMember(owner = "client!iq", name = "b", descriptor = "Lclient!ct;")
	private final Class58 aClass58_2;

	@OriginalMember(owner = "client!iq", name = "e", descriptor = "Lclient!fba;")
	private final Class95 aClass95_1;

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(Lclient!ct;Lclient!fba;)V")
	public Class150(@OriginalArg(0) Class58 arg0, @OriginalArg(1) Class95 arg1) {
		this.aClass58_2 = arg0;
		this.aClass95_1 = arg1;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method6565() {
		@Pc(18) Class224 local18 = this.aClass58_2.method951(this.aClass95_1.anInt2234);
		if (local18 == null) {
			return;
		}
		@Pc(34) int local34 = this.aClass95_1.aClass277_3.method6409(Static282.anInt4679, this.aClass95_1.anInt2240) + this.aClass95_1.anInt2238;
		@Pc(48) int local48 = this.aClass95_1.aClass137_4.method2982(Static381.anInt6587, this.aClass95_1.anInt2235) + this.aClass95_1.anInt2244;
		if (this.aClass95_1.aBoolean146) {
			Static176.aClass121_5.method7127(local34, local48, this.aClass95_1.anInt2240, this.aClass95_1.anInt2235, this.aClass95_1.anInt2241, 0);
		}
		local48 += this.method3210(local18.aString78, Static408.aClass56_4, local34, local48) * 12;
		local48 += 8;
		if (this.aClass95_1.aBoolean146) {
			Static176.aClass121_5.method7094(local34, local48, local34 + this.aClass95_1.anInt2240 - 1, local48, this.aClass95_1.anInt2241, 0);
		}
		local48++;
		local48 += this.method3210(local18.aString79, Static408.aClass56_4, local34, local48) * 12;
		local48 += 5;
		@Pc(130) int local130 = local48 + this.method3210(local18.aString77, Static408.aClass56_4, local34, local48) * 12;
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(Ljava/lang/String;IILclient!ta;II)I")
	private int method3210(@OriginalArg(0) String arg0, @OriginalArg(3) Class56 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		return arg1.method7881(null, 0, this.aClass95_1.anInt2235 - 10, this.aClass95_1.anInt2240 + -10, arg0, 0, 0, 0, null, null, arg2 + 5, this.aClass95_1.anInt2245, this.aClass95_1.anInt2239, arg3 + 5);
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method6566() {
		return this.aClass58_2.method949();
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(B)V")
	@Override
	public void method6567() {
	}
}
