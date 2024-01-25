import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class34 {

	@OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
	private int anInt1397 = -1;

	@OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
	private int anInt1399 = 0;

	@OriginalMember(owner = "client!dg", name = "i", descriptor = "Lclient!eb;")
	private Class42 aClass42_4 = new Class42();

	@OriginalMember(owner = "client!dg", name = "p", descriptor = "Z")
	public boolean aBoolean100 = false;

	@OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
	private final int anInt1394;

	@OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
	private final int anInt1395;

	@OriginalMember(owner = "client!dg", name = "o", descriptor = "[Lclient!mi;")
	private Class1_Sub29[] aClass1_Sub29Array1;

	@OriginalMember(owner = "client!dg", name = "k", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray34;

	@OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(III)V")
	public Class34(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1394 = arg0;
		this.anInt1395 = arg1;
		this.aClass1_Sub29Array1 = new Class1_Sub29[this.anInt1395];
		this.anIntArrayArrayArray34 = new int[this.anInt1394][3][arg2];
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)[[[I")
	public int[][][] method1353() {
		if (this.anInt1395 != this.anInt1394) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(29) int local29 = 0; local29 < this.anInt1394; local29++) {
			this.aClass1_Sub29Array1[local29] = Static2.aClass1_Sub29_1;
		}
		return this.anIntArrayArrayArray34;
	}

	@OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
	public void method1355() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt1394; local3++) {
			this.anIntArrayArrayArray34[local3][0] = null;
			this.anIntArrayArrayArray34[local3][1] = null;
			this.anIntArrayArrayArray34[local3][2] = null;
			this.anIntArrayArrayArray34[local3] = null;
		}
		this.anIntArrayArrayArray34 = null;
		this.aClass1_Sub29Array1 = null;
		this.aClass42_4.method1542();
		this.aClass42_4 = null;
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[[I")
	public int[][] method1356(@OriginalArg(1) int arg0) {
		if (this.anInt1394 == this.anInt1395) {
			this.aBoolean100 = this.aClass1_Sub29Array1[arg0] == null;
			this.aClass1_Sub29Array1[arg0] = Static2.aClass1_Sub29_1;
			return this.anIntArrayArrayArray34[arg0];
		} else if (this.anInt1394 == 1) {
			this.aBoolean100 = arg0 != this.anInt1397;
			this.anInt1397 = arg0;
			return this.anIntArrayArrayArray34[0];
		} else {
			@Pc(65) Class1_Sub29 local65 = this.aClass1_Sub29Array1[arg0];
			if (local65 == null) {
				this.aBoolean100 = true;
				if (this.anInt1394 > this.anInt1399) {
					local65 = new Class1_Sub29(arg0, this.anInt1399);
					this.anInt1399++;
				} else {
					@Pc(105) Class1_Sub29 local105 = (Class1_Sub29) this.aClass42_4.method1544();
					local65 = new Class1_Sub29(arg0, local105.anInt4015);
					this.aClass1_Sub29Array1[local105.anInt4014] = null;
					local105.method6045();
				}
				this.aClass1_Sub29Array1[arg0] = local65;
			} else {
				this.aBoolean100 = false;
			}
			this.aClass42_4.method1539(local65);
			return this.anIntArrayArrayArray34[local65.anInt4015];
		}
	}
}
