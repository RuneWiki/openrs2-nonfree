import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!or", name = "w", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!or", name = "E", descriptor = "[I")
	public int[] anIntArray438;

	@OriginalMember(owner = "client!or", name = "G", descriptor = "Ljava/lang/String;")
	public String aString179;

	@OriginalMember(owner = "client!or", name = "J", descriptor = "[I")
	public int[] anIntArray439;

	@OriginalMember(owner = "client!or", name = "K", descriptor = "[C")
	public char[] aCharArray6;

	@OriginalMember(owner = "client!or", name = "f", descriptor = "(I)V")
	public void method4089() {
		@Pc(6) int local6;
		if (this.anIntArray439 != null) {
			for (local6 = 0; local6 < this.anIntArray439.length; local6++) {
				this.anIntArray439[local6] |= 0x8000;
			}
		}
		if (this.anIntArray438 != null) {
			for (local6 = 0; local6 < this.anIntArray438.length; local6++) {
				this.anIntArray438[local6] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!nj;IB)V")
	private void method4090(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString179 = arg0.method5701();
			return;
		}
		@Pc(23) int local23;
		@Pc(33) int local33;
		@Pc(46) byte local46;
		if (arg1 == 2) {
			local23 = arg0.method5720();
			this.anIntArray438 = new int[local23];
			this.aCharArray6 = new char[local23];
			for (local33 = 0; local33 < local23; local33++) {
				this.anIntArray438[local33] = arg0.method5715();
				local46 = arg0.method5721();
				this.aCharArray6[local33] = local46 == 0 ? 0 : Static287.method5025(local46);
			}
			return;
		}
		if (arg1 != 3) {
			return;
		}
		local23 = arg0.method5720();
		this.aCharArray5 = new char[local23];
		this.anIntArray439 = new int[local23];
		for (local33 = 0; local33 < local23; local33++) {
			this.anIntArray439[local33] = arg0.method5715();
			local46 = arg0.method5721();
			this.aCharArray5[local33] = local46 == 0 ? 0 : Static287.method5025(local46);
		}
		return;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(CZ)I")
	public int method4092(@OriginalArg(0) char arg0) {
		if (this.anIntArray438 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray438.length; local12++) {
			if (this.aCharArray6[local12] == arg0) {
				return this.anIntArray438[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!nj;I)V")
	public void method4093(@OriginalArg(0) Class1_Sub21 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method5720();
			if (local14 == 0) {
				return;
			}
			this.method4090(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(CI)I")
	public int method4094(@OriginalArg(0) char arg0) {
		if (this.anIntArray439 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray439.length; local17++) {
			if (this.aCharArray5[local17] == arg0) {
				return this.anIntArray439[local17];
			}
		}
		return -1;
	}
}
