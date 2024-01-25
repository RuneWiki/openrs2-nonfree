import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class264 implements Interface23 {

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Lclient!um;")
	private final Class338 aClass338_1;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "Lclient!oi;")
	private final Class251 aClass251_1;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!um;Lclient!oi;)V")
	public Class264(@OriginalArg(0) Class338 arg0, @OriginalArg(1) Class251 arg1) {
		this.aClass338_1 = arg0;
		this.aClass251_1 = arg1;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIBLjava/lang/String;ILclient!ta;)I")
	private int method5806(@OriginalArg(0) int arg0, @OriginalArg(3) String arg1, @OriginalArg(4) int arg2, @OriginalArg(5) Class91 arg3) {
		return arg3.method7465(this.aClass251_1.anInt6753, 0, arg0 + 5, this.aClass251_1.anInt6758 - 10, 0, arg2 + 5, arg1, 0, null, null, 0, this.aClass251_1.anInt6752 - 10, this.aClass251_1.anInt6759, 0, null);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7805() {
		@Pc(17) Class12 local17 = this.aClass338_1.method7447(this.aClass251_1.anInt6760);
		if (local17 == null) {
			return;
		}
		@Pc(33) int local33 = this.aClass251_1.aClass297_9.method6544(this.aClass251_1.anInt6752, Static9.anInt8933) + this.aClass251_1.anInt6756;
		@Pc(48) int local48 = this.aClass251_1.aClass58_10.method1299(this.aClass251_1.anInt6758, Static576.anInt9547) + this.aClass251_1.anInt6754;
		if (this.aClass251_1.aBoolean502) {
			Static185.aClass66_14.method6786(local33, local48, this.aClass251_1.anInt6752, this.aClass251_1.anInt6758, this.aClass251_1.anInt6757, 0);
		}
		local48 += this.method5806(local48, local17.aString4, local33, Static65.aClass91_4) * 12;
		local48 += 8;
		if (this.aClass251_1.aBoolean502) {
			Static185.aClass66_14.method6826(local33, local48, local33 + this.aClass251_1.anInt6752 - 1, local48, this.aClass251_1.anInt6757, 0);
		}
		local48++;
		local48 += this.method5806(local48, local17.aString3, local33, Static65.aClass91_4) * 12;
		local48 += 5;
		@Pc(131) int local131 = local48 + this.method5806(local48, local17.aString5, local33, Static65.aClass91_4) * 12;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
	@Override
	public void method7804() {
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7806() {
		return this.aClass338_1.method7446();
	}
}
