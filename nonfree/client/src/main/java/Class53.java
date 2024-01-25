import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dq")
public final class Class53 {

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
	private int anInt1091 = 0;

	@OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
	private int anInt1093 = -1;

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "Lclient!jm;")
	private Class103 aClass103_29 = new Class103();

	@OriginalMember(owner = "client!dq", name = "p", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
	private final int anInt1087;

	@OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
	private final int anInt1092;

	@OriginalMember(owner = "client!dq", name = "j", descriptor = "[Lclient!sa;")
	private Class5_Sub37[] aClass5_Sub37Array1;

	@OriginalMember(owner = "client!dq", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	static {
		new Class85("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(III)V")
	public Class53(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1087 = arg1;
		this.anInt1092 = arg0;
		this.aClass5_Sub37Array1 = new Class5_Sub37[this.anInt1087];
		this.anIntArrayArrayArray1 = new int[this.anInt1092][3][arg2];
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
	public void method966() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1092; local3++) {
			this.anIntArrayArrayArray1[local3][0] = null;
			this.anIntArrayArrayArray1[local3][1] = null;
			this.anIntArrayArrayArray1[local3][2] = null;
			this.anIntArrayArrayArray1[local3] = null;
		}
		this.aClass5_Sub37Array1 = null;
		this.anIntArrayArrayArray1 = null;
		this.aClass103_29.method2751();
		this.aClass103_29 = null;
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZI)[[I")
	public int[][] method969(@OriginalArg(1) int arg0) {
		if (this.anInt1092 == this.anInt1087) {
			this.aBoolean83 = this.aClass5_Sub37Array1[arg0] == null;
			this.aClass5_Sub37Array1[arg0] = Static99.aClass5_Sub37_1;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt1092 == 1) {
			this.aBoolean83 = this.anInt1093 != arg0;
			this.anInt1093 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(48) Class5_Sub37 local48 = this.aClass5_Sub37Array1[arg0];
			if (local48 == null) {
				this.aBoolean83 = true;
				if (this.anInt1092 > this.anInt1091) {
					local48 = new Class5_Sub37(arg0, this.anInt1091);
					this.anInt1091++;
				} else {
					@Pc(88) Class5_Sub37 local88 = (Class5_Sub37) this.aClass103_29.method2746();
					local48 = new Class5_Sub37(arg0, local88.anInt5625);
					this.aClass5_Sub37Array1[local88.anInt5628] = null;
					local88.method6005();
				}
				this.aClass5_Sub37Array1[arg0] = local48;
			} else {
				this.aBoolean83 = false;
			}
			this.aClass103_29.method2752(local48);
			return this.anIntArrayArrayArray1[local48.anInt5625];
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)[[[I")
	public int[][][] method970() {
		if (this.anInt1087 != this.anInt1092) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(22) int local22 = 0; local22 < this.anInt1092; local22++) {
			this.aClass5_Sub37Array1[local22] = Static99.aClass5_Sub37_1;
		}
		return this.anIntArrayArrayArray1;
	}
}
