import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ck")
public final class Class3_Sub3_Sub3 extends Class3_Sub3 {

	@OriginalMember(owner = "client!ck", name = "t", descriptor = "[I")
	public int[] anIntArray51;

	@OriginalMember(owner = "client!ck", name = "u", descriptor = "[I")
	public int[] anIntArray52;

	@OriginalMember(owner = "client!ck", name = "z", descriptor = "[C")
	public char[] aCharArray1;

	@OriginalMember(owner = "client!ck", name = "C", descriptor = "Ljava/lang/String;")
	public String aString6;

	@OriginalMember(owner = "client!ck", name = "F", descriptor = "[C")
	public char[] aCharArray2;

	static {
		new Class174("You are temporarily blocked from joining channels - please try again later!", "Du darfst derzeit keine Chaträume betreten - bitte versuch es später.", "Vous êtes temporairement exclu des canaux - veuillez réessayer ultérieurement.", "Você está temporariamente impedido de entrar em canais. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)V")
	public void method980() {
		@Pc(10) int local10;
		if (this.anIntArray52 != null) {
			for (local10 = 0; local10 < this.anIntArray52.length; local10++) {
				this.anIntArray52[local10] |= 0x8000;
			}
		}
		if (this.anIntArray51 != null) {
			for (local10 = 0; local10 < this.anIntArray51.length; local10++) {
				this.anIntArray51[local10] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lclient!nj;II)V")
	private void method981(@OriginalArg(0) Class3_Sub25 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aString6 = arg0.method4073();
			return;
		}
		@Pc(24) int local24;
		@Pc(34) int local34;
		@Pc(47) byte local47;
		if (arg1 == 2) {
			local24 = arg0.method4096();
			this.aCharArray1 = new char[local24];
			this.anIntArray51 = new int[local24];
			for (local34 = 0; local34 < local24; local34++) {
				this.anIntArray51[local34] = arg0.method4083();
				local47 = arg0.method4097();
				this.aCharArray1[local34] = local47 == 0 ? 0 : Static331.method5972(local47);
			}
			return;
		}
		if (arg1 != 3) {
			return;
		}
		local24 = arg0.method4096();
		this.aCharArray2 = new char[local24];
		this.anIntArray52 = new int[local24];
		for (local34 = 0; local34 < local24; local34++) {
			this.anIntArray52[local34] = arg0.method4083();
			local47 = arg0.method4097();
			this.aCharArray2[local34] = local47 == 0 ? 0 : Static331.method5972(local47);
		}
		return;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(CZ)I")
	public int method982(@OriginalArg(0) char arg0) {
		if (this.anIntArray51 == null) {
			return -1;
		}
		for (@Pc(18) int local18 = 0; local18 < this.anIntArray51.length; local18++) {
			if (arg0 == this.aCharArray1[local18]) {
				return this.anIntArray51[local18];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(CB)I")
	public int method985(@OriginalArg(0) char arg0) {
		if (this.anIntArray52 == null) {
			return -1;
		}
		for (@Pc(12) int local12 = 0; local12 < this.anIntArray52.length; local12++) {
			if (arg0 == this.aCharArray2[local12]) {
				return this.anIntArray52[local12];
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILclient!nj;)V")
	public void method986(@OriginalArg(1) Class3_Sub25 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4096();
			if (local5 == 0) {
				return;
			}
			this.method981(arg0, local5);
		}
	}
}
