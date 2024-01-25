import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fba")
public final class Class3_Sub11_Sub6 extends Class3_Sub11 {

	@OriginalMember(owner = "client!fba", name = "y", descriptor = "[I")
	public int[] anIntArray264;

	@OriginalMember(owner = "client!fba", name = "z", descriptor = "[C")
	public char[] aCharArray3;

	@OriginalMember(owner = "client!fba", name = "C", descriptor = "Ljava/lang/String;")
	public String aString29;

	@OriginalMember(owner = "client!fba", name = "E", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!fba", name = "J", descriptor = "[I")
	public int[] anIntArray265;

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(CI)I")
	public int method2814(@OriginalArg(0) char arg0) {
		if (this.anIntArray265 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray265.length; local12++) {
			if (arg0 == this.aCharArray4[local12]) {
				return this.anIntArray265[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(ILclient!jp;)V")
	public void method2817(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method8632();
			if (local13 == 0) {
				return;
			}
			this.method2823(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(IC)I")
	public int method2820(@OriginalArg(1) char arg0) {
		if (this.anIntArray264 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray264.length; local12++) {
			if (this.aCharArray3[local12] == arg0) {
				return this.anIntArray264[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(I)V")
	public void method2821() {
		@Pc(14) int local14;
		if (this.anIntArray265 != null) {
			for (local14 = 0; local14 < this.anIntArray265.length; local14++) {
				this.anIntArray265[local14] |= 0x8000;
			}
		}
		if (this.anIntArray264 != null) {
			for (local14 = 0; local14 < this.anIntArray264.length; local14++) {
				this.anIntArray264[local14] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lclient!jp;IB)V")
	private void method2823(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString29 = arg0.method8613();
			return;
		}
		@Pc(11) int local11;
		@Pc(21) int local21;
		@Pc(34) byte local34;
		if (arg1 == 2) {
			local11 = arg0.method8632();
			this.aCharArray3 = new char[local11];
			this.anIntArray264 = new int[local11];
			for (local21 = 0; local21 < local11; local21++) {
				this.anIntArray264[local21] = arg0.method8593();
				local34 = arg0.method8621();
				this.aCharArray3[local21] = local34 == 0 ? 0 : Static375.method5437(local34);
			}
		} else if (arg1 == 3) {
			local11 = arg0.method8632();
			this.anIntArray265 = new int[local11];
			this.aCharArray4 = new char[local11];
			for (local21 = 0; local21 < local11; local21++) {
				this.anIntArray265[local21] = arg0.method8593();
				local34 = arg0.method8621();
				this.aCharArray4[local21] = local34 == 0 ? 0 : Static375.method5437(local34);
			}
		}
	}
}
