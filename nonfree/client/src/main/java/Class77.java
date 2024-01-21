import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class77 {

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "J")
	private long aLong83;

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "Lclient!ca;")
	private Class2 aClass2_117;

	@OriginalMember(owner = "client!uf", name = "v", descriptor = "Lclient!ca;")
	private Class2 aClass2_118;

	@OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
	private int anInt2841 = 0;

	@OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
	private final int anInt2831;

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "[Lclient!ca;")
	private final Class2[] aClass2Array1;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "(I)V")
	public Class77(@OriginalArg(0) int arg0) {
		this.anInt2831 = arg0;
		this.aClass2Array1 = new Class2[arg0];
		for (@Pc(13) int local13 = 0; local13 < arg0; local13++) {
			@Pc(23) Class2 local23 = this.aClass2Array1[local13] = new Class2();
			local23.aClass2_128 = local23;
			local23.aClass2_127 = local23;
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(JLclient!ca;I)V")
	public void method2030(@OriginalArg(0) long arg0, @OriginalArg(1) Class2 arg1) {
		if (arg1.aClass2_127 != null) {
			arg1.method2209();
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) ((long) (this.anInt2831 - 1) & arg0)];
		arg1.aClass2_127 = local21.aClass2_127;
		arg1.aLong100 = arg0;
		arg1.aClass2_128 = local21;
		arg1.aClass2_127.aClass2_128 = arg1;
		arg1.aClass2_128.aClass2_127 = arg1;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)Lclient!ca;")
	public Class2 method2031() {
		this.anInt2841 = 0;
		return this.method2039();
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IJ)Lclient!ca;")
	public Class2 method2034(@OriginalArg(1) long arg0) {
		this.aLong83 = arg0;
		@Pc(23) Class2 local23 = this.aClass2Array1[(int) ((long) (this.anInt2831 - 1) & arg0)];
		for (this.aClass2_117 = local23.aClass2_128; this.aClass2_117 != local23; this.aClass2_117 = this.aClass2_117.aClass2_128) {
			if (this.aClass2_117.aLong100 == arg0) {
				@Pc(41) Class2 local41 = this.aClass2_117;
				this.aClass2_117 = this.aClass2_117.aClass2_128;
				return local41;
			}
		}
		this.aClass2_117 = null;
		return null;
	}

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Lclient!ca;")
	public Class2 method2039() {
		@Pc(26) Class2 local26;
		if (this.anInt2841 > 0 && this.aClass2_118 != this.aClass2Array1[this.anInt2841 - 1]) {
			local26 = this.aClass2_118;
			this.aClass2_118 = local26.aClass2_128;
			return local26;
		}
		while (this.anInt2831 > this.anInt2841) {
			local26 = this.aClass2Array1[this.anInt2841++].aClass2_128;
			if (this.aClass2Array1[this.anInt2841 - 1] != local26) {
				this.aClass2_118 = local26.aClass2_128;
				return local26;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)Lclient!ca;")
	public Class2 method2040() {
		if (this.aClass2_117 == null) {
			return null;
		}
		@Pc(21) Class2 local21 = this.aClass2Array1[(int) (this.aLong83 & (long) (this.anInt2831 - 1))];
		while (local21 != this.aClass2_117) {
			if (this.aClass2_117.aLong100 == this.aLong83) {
				@Pc(42) Class2 local42 = this.aClass2_117;
				this.aClass2_117 = this.aClass2_117.aClass2_128;
				return local42;
			}
			this.aClass2_117 = this.aClass2_117.aClass2_128;
		}
		this.aClass2_117 = null;
		return null;
	}
}
