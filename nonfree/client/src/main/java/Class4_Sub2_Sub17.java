import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ph")
public final class Class4_Sub2_Sub17 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ph", name = "y", descriptor = "[I")
	public int[] anIntArray343;

	@OriginalMember(owner = "client!ph", name = "A", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!ph", name = "B", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "[I")
	public int[] anIntArray345;

	@OriginalMember(owner = "client!ph", name = "Q", descriptor = "Ljava/lang/String;")
	public String aString142;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!pi;)V")
	public void method3312(@OriginalArg(1) Class4_Sub24 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method3110();
			if (local17 == 0) {
				return;
			}
			this.method3315(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lclient!pi;II)V")
	private void method3315(@OriginalArg(0) Class4_Sub24 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aString142 = arg0.method3111();
			return;
		}
		@Pc(13) int local13;
		@Pc(23) int local23;
		@Pc(39) byte local39;
		if (arg1 == 2) {
			local13 = arg0.method3110();
			this.aCharArray4 = new char[local13];
			this.anIntArray343 = new int[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray343[local23] = arg0.method3085();
				local39 = arg0.method3069();
				this.aCharArray4[local23] = local39 == 0 ? 0 : Static131.method1213(local39);
			}
		} else if (arg1 == 3) {
			local13 = arg0.method3110();
			this.aCharArray5 = new char[local13];
			this.anIntArray345 = new int[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray345[local23] = arg0.method3085();
				local39 = arg0.method3069();
				this.aCharArray5[local23] = local39 == 0 ? 0 : Static131.method1213(local39);
			}
		} else if (arg1 != 4) {
		}
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(CI)I")
	public int method3318(@OriginalArg(0) char arg0) {
		if (this.anIntArray345 == null) {
			return -1;
		}
		for (@Pc(13) int local13 = 0; local13 < this.anIntArray345.length; local13++) {
			if (arg0 == this.aCharArray5[local13]) {
				return this.anIntArray345[local13];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(BC)I")
	public int method3320(@OriginalArg(1) char arg0) {
		if (this.anIntArray343 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray343.length; local18++) {
			if (arg0 == this.aCharArray4[local18]) {
				return this.anIntArray343[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
	public void method3321() {
		@Pc(15) int local15;
		if (this.anIntArray345 != null) {
			for (local15 = 0; local15 < this.anIntArray345.length; local15++) {
				this.anIntArray345[local15] |= 0x8000;
			}
		}
		if (this.anIntArray343 != null) {
			for (local15 = 0; local15 < this.anIntArray343.length; local15++) {
				this.anIntArray343[local15] |= 0x8000;
			}
		}
	}
}
