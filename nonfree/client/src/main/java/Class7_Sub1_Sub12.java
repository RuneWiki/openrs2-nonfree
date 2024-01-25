import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!is")
public final class Class7_Sub1_Sub12 extends Class7_Sub1 {

	@OriginalMember(owner = "client!is", name = "E", descriptor = "[I")
	public int[] anIntArray404;

	@OriginalMember(owner = "client!is", name = "I", descriptor = "[C")
	public char[] aCharArray4;

	@OriginalMember(owner = "client!is", name = "J", descriptor = "[I")
	public int[] anIntArray405;

	@OriginalMember(owner = "client!is", name = "M", descriptor = "[C")
	public char[] aCharArray5;

	@OriginalMember(owner = "client!is", name = "O", descriptor = "Ljava/lang/String;")
	public String aString204;

	@OriginalMember(owner = "client!is", name = "e", descriptor = "(B)V")
	public void method2868() {
		@Pc(16) int local16;
		if (this.anIntArray405 != null) {
			for (local16 = 0; local16 < this.anIntArray405.length; local16++) {
				this.anIntArray405[local16] |= 0x8000;
			}
		}
		if (this.anIntArray404 != null) {
			for (local16 = 0; local16 < this.anIntArray404.length; local16++) {
				this.anIntArray404[local16] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZC)I")
	public int method2869(@OriginalArg(1) char arg0) {
		if (this.anIntArray404 == null) {
			return -1;
		}
		for (@Pc(10) int local10 = 0; local10 < this.anIntArray404.length; local10++) {
			if (arg0 == this.aCharArray4[local10]) {
				return this.anIntArray404[local10];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZLclient!ap;)V")
	public void method2870(@OriginalArg(1) Class7_Sub3 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method2772();
			if (local7 == 0) {
				return;
			}
			this.method2872(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(CI)I")
	public int method2871(@OriginalArg(0) char arg0) {
		if (this.anIntArray405 == null) {
			return -1;
		}
		for (@Pc(15) int local15 = 0; local15 < this.anIntArray405.length; local15++) {
			if (this.aCharArray5[local15] == arg0) {
				return this.anIntArray405[local15];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!ap;B)V")
	private void method2872(@OriginalArg(0) int arg0, @OriginalArg(1) Class7_Sub3 arg1) {
		if (arg0 == 1) {
			this.aString204 = arg1.method2782();
			return;
		}
		@Pc(20) int local20;
		@Pc(30) int local30;
		@Pc(44) byte local44;
		if (arg0 == 2) {
			local20 = arg1.method2772();
			this.aCharArray4 = new char[local20];
			this.anIntArray404 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray404[local30] = arg1.method2764();
				local44 = arg1.method2779();
				this.aCharArray4[local30] = local44 == 0 ? 0 : Static224.method3944(local44);
			}
		} else if (arg0 == 3) {
			local20 = arg1.method2772();
			this.aCharArray5 = new char[local20];
			this.anIntArray405 = new int[local20];
			for (local30 = 0; local30 < local20; local30++) {
				this.anIntArray405[local30] = arg1.method2764();
				local44 = arg1.method2779();
				this.aCharArray5[local30] = local44 == 0 ? 0 : Static224.method3944(local44);
			}
		}
	}
}
