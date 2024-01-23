import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ja")
public final class Class1_Sub2_Sub9 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ja", name = "N", descriptor = "[I")
	public int[] anIntArray213;

	@OriginalMember(owner = "client!ja", name = "V", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!ja", name = "W", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!ja", name = "Z", descriptor = "Lclient!sc;")
	public Class107 aClass107_593;

	@OriginalMember(owner = "client!ja", name = "cb", descriptor = "[I")
	public int[] anIntArray216;

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
	public void method1662() {
		@Pc(14) int local14;
		if (this.anIntArray215 != null) {
			for (local14 = 0; local14 < this.anIntArray215.length; local14++) {
				this.anIntArray215[local14] |= 0x8000;
			}
		}
		if (this.anIntArray213 != null) {
			for (local14 = 0; local14 < this.anIntArray213.length; local14++) {
				this.anIntArray213[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!vf;)V")
	public void method1664(@OriginalArg(1) Class1_Sub26 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2945();
			if (local13 == 0) {
				return;
			}
			this.method1666(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!vf;II)V")
	private void method1666(@OriginalArg(0) Class1_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aClass107_593 = arg0.method2978();
			return;
		}
		@Pc(20) int local20;
		@Pc(30) int local30;
		@Pc(45) int local45;
		if (arg1 == 2) {
			local20 = arg0.method2945();
			this.anIntArray216 = new int[local20];
			this.anIntArray213 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray213[local30] = arg0.method2964();
				local45 = arg0.method2945();
				if (local45 == 0) {
					this.anIntArray216[local30] = -1;
				} else {
					this.anIntArray216[local30] = local45;
				}
			}
		} else if (arg1 == 3) {
			local20 = arg0.method2945();
			this.anIntArray214 = new int[local20];
			this.anIntArray215 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray215[local30] = arg0.method2964();
				local45 = arg0.method2945();
				if (local45 == 0) {
					this.anIntArray214[local30] = -1;
				} else {
					this.anIntArray214[local30] = local45;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)I")
	public int method1670(@OriginalArg(1) int arg0) {
		if (this.anIntArray213 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray213.length; local17++) {
			if (this.anIntArray216[local17] == arg0) {
				return this.anIntArray213[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "(II)I")
	public int method1671(@OriginalArg(0) int arg0) {
		if (this.anIntArray215 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray215.length; local12++) {
			if (this.anIntArray214[local12] == arg0) {
				return this.anIntArray215[local12];
			}
		}
		return -1;
	}
}
