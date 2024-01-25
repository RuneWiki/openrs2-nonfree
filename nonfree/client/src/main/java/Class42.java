import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class42 implements Interface11 {

	@OriginalMember(owner = "client!cc", name = "m", descriptor = "Lclient!ta;")
	private Class111 aClass111_2;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!pe;")
	private final Class254 aClass254_18;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "Lclient!dv;")
	private final Class72 aClass72_1;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "Lclient!pe;")
	private final Class254 aClass254_19;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lclient!pe;Lclient!pe;Lclient!dv;)V")
	public Class42(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1, @OriginalArg(2) Class72 arg2) {
		this.aClass254_18 = arg1;
		this.aClass72_1 = arg2;
		this.aClass254_19 = arg0;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8276() {
		@Pc(31) int local31 = this.aClass72_1.aClass100_3.method2801(Static507.anInt9382, this.aClass72_1.anInt2405) + this.aClass72_1.anInt2407;
		@Pc(46) int local46 = this.aClass72_1.aClass237_2.method6027(this.aClass72_1.anInt2414, Static227.anInt4616) + this.aClass72_1.anInt2411;
		this.aClass111_2.method6688(0, this.aClass72_1.anInt2412, this.aClass72_1.anInt2414, local46, local31, this.aClass72_1.anInt2413, this.aClass72_1.aString31, null, null, this.aClass72_1.anInt2410, null, 0, this.aClass72_1.anInt2405, this.aClass72_1.anInt2409, this.aClass72_1.anInt2416);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
	@Override
	public void method8277() {
		@Pc(19) Class297 local19 = Static356.method5901(this.aClass254_18, this.aClass72_1.anInt2403);
		this.aClass111_2 = Static546.aClass15_16.method5346(local19, Static599.method819(this.aClass254_19, this.aClass72_1.anInt2403));
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8278() {
		@Pc(11) boolean local11 = true;
		if (!this.aClass254_19.method6417(this.aClass72_1.anInt2403)) {
			local11 = false;
		}
		if (!this.aClass254_18.method6417(this.aClass72_1.anInt2403)) {
			local11 = false;
		}
		return local11;
	}
}
