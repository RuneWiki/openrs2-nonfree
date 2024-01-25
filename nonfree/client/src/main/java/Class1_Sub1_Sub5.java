import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cm")
public final class Class1_Sub1_Sub5 extends Class1_Sub1 {

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "[I")
	private int[] anIntArray47;

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "[I")
	public int[] anIntArray48;

	@OriginalMember(owner = "client!cm", name = "E", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray9;

	@OriginalMember(owner = "client!cm", name = "K", descriptor = "Lclient!tm;")
	public Class228 aClass228_2;

	@OriginalMember(owner = "client!cm", name = "L", descriptor = "[[I")
	private int[][] anIntArrayArray2;

	@OriginalMember(owner = "client!cm", name = "F", descriptor = "Z")
	public boolean aBoolean75 = true;

	static {
		new Class96("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZ)Lclient!sv;")
	public Class222 method768(@OriginalArg(0) int arg0) {
		return this.anIntArray47 == null || arg0 < 0 || this.anIntArray47.length < arg0 ? null : Static77.method1142(this.anIntArray47[arg0]);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!ti;[IB)V")
	public void method769(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int[] arg1) {
		if (this.anIntArray47 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray47.length; local16++) {
			if (arg1.length <= local16) {
				return;
			}
			@Pc(24) int local24 = this.method768(local16).anInt6746;
			if (local24 > 0) {
				arg0.method4530((long) arg1[local16], local24);
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BLclient!ti;)V")
	public void method771(@OriginalArg(1) Class1_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4548();
			if (local13 == 0) {
				return;
			}
			this.method773(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Z)V")
	public void method772() {
		if (this.anIntArray48 != null) {
			for (@Pc(12) int local12 = 0; local12 < this.anIntArray48.length; local12++) {
				this.anIntArray48[local12] |= 0x8000;
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!ti;ZI)V")
	private void method773(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aStringArray9 = Static71.method1050('<', arg0.method4509());
			return;
		}
		@Pc(21) int local21;
		@Pc(27) int local27;
		if (arg1 == 2) {
			local21 = arg0.method4548();
			this.anIntArray48 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				this.anIntArray48[local27] = arg0.method4498();
			}
		} else if (arg1 == 3) {
			local21 = arg0.method4548();
			this.anIntArrayArray2 = new int[local21][];
			this.anIntArray47 = new int[local21];
			for (local27 = 0; local27 < local21; local27++) {
				@Pc(65) int local65 = arg0.method4498();
				@Pc(69) Class222 local69 = Static77.method1142(local65);
				if (local69 != null) {
					this.anIntArray47[local27] = local65;
					this.anIntArrayArray2[local27] = new int[local69.anInt6748];
					for (@Pc(85) int local85 = 0; local85 < local69.anInt6748; local85++) {
						this.anIntArrayArray2[local27][local85] = arg0.method4498();
					}
				}
			}
		} else if (arg1 == 4) {
			this.aBoolean75 = false;
		}
	}

	@OriginalMember(owner = "client!cm", name = "g", descriptor = "(I)Ljava/lang/String;")
	public String method774() {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.aStringArray9 == null) {
			return "";
		}
		local10.append(this.aStringArray9[0]);
		for (@Pc(24) int local24 = 1; local24 < this.aStringArray9.length; local24++) {
			local10.append("...");
			local10.append(this.aStringArray9[local24]);
		}
		return local10.toString();
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!ti;Z)Ljava/lang/String;")
	public String method775(@OriginalArg(0) Class1_Sub14 arg0) {
		@Pc(10) StringBuffer local10 = new StringBuffer(80);
		if (this.anIntArray47 != null) {
			for (@Pc(20) int local20 = 0; local20 < this.anIntArray47.length; local20++) {
				local10.append(this.aStringArray9[local20]);
				local10.append(this.aClass228_2.method5370(arg0.method4497(Static77.method1142(this.anIntArray47[local20]).anInt6747), this.anIntArrayArray2[local20], this.method768(local20)));
			}
		}
		local10.append(this.aStringArray9[this.aStringArray9.length - 1]);
		return local10.toString();
	}

	@OriginalMember(owner = "client!cm", name = "h", descriptor = "(I)I")
	public int method776() {
		return this.anIntArray47 == null ? 0 : this.anIntArray47.length;
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(BII)I")
	public int method777(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray47 == null || arg1 < 0 || this.anIntArray47.length < arg1) {
			return -1;
		} else if (this.anIntArrayArray2[arg1] == null || arg0 < 0 || this.anIntArrayArray2[arg1].length < arg0) {
			return -1;
		} else {
			return this.anIntArrayArray2[arg1][arg0];
		}
	}
}
