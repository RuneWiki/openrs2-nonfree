import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class44 implements Interface2 {

	@OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
	private int anInt2330 = 50;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
	private int anInt2336 = 128;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!ah;")
	private final Class7 aClass7_37;

	@OriginalMember(owner = "client!ka", name = "g", descriptor = "Lclient!ah;")
	private final Class7 aClass7_36;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "Lclient!pa;")
	private Class63 aClass63_13;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!ah;Lclient!ah;II)V")
	public Class44(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class7 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt2330 = arg2;
		this.aClass7_37 = arg1;
		this.anInt2336 = arg3;
		this.aClass7_36 = arg0;
		this.aClass63_13 = new Class63(this.anInt2330);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(IZ)Z")
	@Override
	public boolean method1829(@OriginalArg(0) int arg0) {
		return this.anInt2336 == 64 || this.method1834(arg0).anInt2936 == 64;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)Z")
	@Override
	public boolean method1830(@OriginalArg(1) int arg0) {
		return this.method1834(arg0).aBoolean143;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IB)I")
	@Override
	public int method1825(@OriginalArg(0) int arg0) {
		return this.method1834(arg0).anInt2943;
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method1828(@OriginalArg(0) int arg0) {
		@Pc(13) Class3_Sub8 local13 = new Class3_Sub8(this.aClass7_36.method1021(0, arg0));
		@Pc(23) Class3_Sub2_Sub15 local23 = new Class3_Sub2_Sub15(local13);
		return local23.method2296(this, this.anInt2336, this.aClass7_37);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(IIF)[I")
	@Override
	public int[] method1827(@OriginalArg(0) int arg0, @OriginalArg(2) float arg1) {
		@Pc(6) Class3_Sub2_Sub15 local6 = this.method1834(arg0);
		local6.aBoolean144 = true;
		return local6.method2300(arg1, this, this.anInt2336, this.aClass7_37);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)Z")
	@Override
	public boolean method1826(@OriginalArg(1) int arg0) {
		return this.method1834(arg0).method2298(this.aClass7_37, this);
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
	public void method1833() {
		this.aClass63_13 = new Class63(this.anInt2330);
	}

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)Lclient!og;")
	private Class3_Sub2_Sub15 method1834(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub2_Sub15 local15 = (Class3_Sub2_Sub15) this.aClass63_13.method2337((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(26) byte[] local26 = this.aClass7_36.method1021(0, arg0);
		if (local26 == null) {
			return Static125.method2489();
		} else {
			@Pc(33) Class3_Sub8 local33 = new Class3_Sub8(local26);
			local15 = new Class3_Sub2_Sub15(local33);
			this.aClass63_13.method2338((long) arg0, local15);
			return local15;
		}
	}

	@OriginalMember(owner = "client!ka", name = "d", descriptor = "(II)V")
	public void method1835(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class3_Sub2_Sub15 local9 = (Class3_Sub2_Sub15) this.aClass63_13.method2343(); local9 != null; local9 = (Class3_Sub2_Sub15) this.aClass63_13.method2342()) {
			if (local9.aBoolean144) {
				local9.method2301(arg0);
				local9.aBoolean144 = false;
			}
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)Z")
	@Override
	public boolean method1824(@OriginalArg(0) int arg0) {
		return this.method1834(arg0).aBoolean142;
	}
}
