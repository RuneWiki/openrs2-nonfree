import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!bn", name = "v", descriptor = "[I")
	public int[] anIntArray96;

	@OriginalMember(owner = "client!bn", name = "D", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!bn", name = "F", descriptor = "Ljava/lang/String;")
	public String aString24;

	@OriginalMember(owner = "client!bn", name = "I", descriptor = "[I")
	public int[] anIntArray97;

	@OriginalMember(owner = "client!bn", name = "J", descriptor = "[C")
	public char[] aCharArray2;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(CI)I")
	public int method856(@OriginalArg(0) char arg0) {
		if (this.anIntArray97 == null) {
			return -1;
		}
		for (@Pc(17) int local17 = 0; local17 < this.anIntArray97.length; local17++) {
			if (arg0 == this.aCharArray1[local17]) {
				return this.anIntArray97[local17];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!eb;I)V")
	private void method859(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString24 = arg0.method3134();
			return;
		}
		@Pc(13) int local13;
		@Pc(23) int local23;
		@Pc(36) byte local36;
		if (arg1 == 2) {
			local13 = arg0.method3141();
			this.anIntArray97 = new int[local13];
			this.aCharArray1 = new char[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray97[local23] = arg0.method3115();
				local36 = arg0.method3130();
				this.aCharArray1[local23] = local36 == 0 ? 0 : Static307.method5174(local36);
			}
		} else if (arg1 == 3) {
			local13 = arg0.method3141();
			this.aCharArray2 = new char[local13];
			this.anIntArray96 = new int[local13];
			for (local23 = 0; local23 < local13; local23++) {
				this.anIntArray96[local23] = arg0.method3115();
				local36 = arg0.method3130();
				this.aCharArray2[local23] = local36 == 0 ? 0 : Static307.method5174(local36);
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(BC)I")
	public int method860(@OriginalArg(1) char arg0) {
		if (this.anIntArray96 == null) {
			return -1;
		}
		for (@Pc(20) int local20 = 0; local20 < this.anIntArray96.length; local20++) {
			if (arg0 == this.aCharArray2[local20]) {
				return this.anIntArray96[local20];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "(B)V")
	public void method861() {
		@Pc(10) int local10;
		if (this.anIntArray96 != null) {
			for (local10 = 0; local10 < this.anIntArray96.length; local10++) {
				this.anIntArray96[local10] |= 0x8000;
			}
		}
		if (this.anIntArray97 != null) {
			for (local10 = 0; local10 < this.anIntArray97.length; local10++) {
				this.anIntArray97[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!eb;)V")
	public void method862(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(12) int local12 = arg0.method3141();
			if (local12 == 0) {
				return;
			}
			this.method859(arg0, local12);
		}
	}
}
