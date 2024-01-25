import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pa")
public final class Class250 {

	@OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
	private int anInt7634 = -1;

	@OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
	private int anInt7637 = 0;

	@OriginalMember(owner = "client!pa", name = "d", descriptor = "Lclient!nt;")
	private Class238 aClass238_53 = new Class238();

	@OriginalMember(owner = "client!pa", name = "r", descriptor = "Z")
	public boolean aBoolean573 = false;

	@OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
	private final int anInt7639;

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
	private final int anInt7632;

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!pa", name = "g", descriptor = "[Lclient!bha;")
	private Class2_Sub8[] aClass2_Sub8Array1;

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(III)V")
	public Class250(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7639 = arg0;
		this.anInt7632 = arg1;
		this.anIntArrayArrayArray9 = new int[this.anInt7639][3][arg2];
		this.aClass2_Sub8Array1 = new Class2_Sub8[this.anInt7632];
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)[[[I")
	public int[][][] method6387() {
		if (this.anInt7632 != this.anInt7639) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt7639; local17++) {
			this.aClass2_Sub8Array1[local17] = Static503.aClass2_Sub8_1;
		}
		return this.anIntArrayArrayArray9;
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)[[I")
	public int[][] method6392(@OriginalArg(1) int arg0) {
		if (this.anInt7632 == this.anInt7639) {
			this.aBoolean573 = this.aClass2_Sub8Array1[arg0] == null;
			this.aClass2_Sub8Array1[arg0] = Static503.aClass2_Sub8_1;
			return this.anIntArrayArrayArray9[arg0];
		} else if (this.anInt7639 == 1) {
			this.aBoolean573 = this.anInt7634 != arg0;
			this.anInt7634 = arg0;
			return this.anIntArrayArrayArray9[0];
		} else {
			@Pc(24) Class2_Sub8 local24 = this.aClass2_Sub8Array1[arg0];
			if (local24 == null) {
				this.aBoolean573 = true;
				if (this.anInt7637 >= this.anInt7639) {
					@Pc(40) Class2_Sub8 local40 = (Class2_Sub8) this.aClass238_53.method5834();
					local24 = new Class2_Sub8(arg0, local40.anInt938);
					this.aClass2_Sub8Array1[local40.anInt936] = null;
					local40.method8599();
				} else {
					local24 = new Class2_Sub8(arg0, this.anInt7637);
					this.anInt7637++;
				}
				this.aClass2_Sub8Array1[arg0] = local24;
			} else {
				this.aBoolean573 = false;
			}
			this.aClass238_53.method5835(local24);
			return this.anIntArrayArrayArray9[local24.anInt938];
		}
	}

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
	public void method6393() {
		for (@Pc(5) int local5 = 0; local5 < this.anInt7639; local5++) {
			this.anIntArrayArrayArray9[local5][0] = null;
			this.anIntArrayArrayArray9[local5][1] = null;
			this.anIntArrayArrayArray9[local5][2] = null;
			this.anIntArrayArrayArray9[local5] = null;
		}
		this.anIntArrayArrayArray9 = null;
		this.aClass2_Sub8Array1 = null;
		this.aClass238_53.method5841();
		this.aClass238_53 = null;
	}
}
