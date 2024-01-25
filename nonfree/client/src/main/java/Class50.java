import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cd")
public final class Class50 {

	@OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
	private int anInt1974 = 0;

	@OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
	private int anInt1982 = -1;

	@OriginalMember(owner = "client!cd", name = "h", descriptor = "Lclient!bq;")
	private Class43 aClass43_16 = new Class43();

	@OriginalMember(owner = "client!cd", name = "t", descriptor = "Z")
	public boolean aBoolean135 = false;

	@OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
	private final int anInt1979;

	@OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
	private final int anInt1973;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "[Lclient!vda;")
	private Class8_Sub49[] aClass8_Sub49Array1;

	@OriginalMember(owner = "client!cd", name = "j", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(III)V")
	public Class50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt1979 = arg1;
		this.anInt1973 = arg0;
		this.aClass8_Sub49Array1 = new Class8_Sub49[this.anInt1979];
		this.anIntArrayArray4 = new int[this.anInt1973][arg2];
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)[I")
	public int[] method1685(@OriginalArg(1) int arg0) {
		if (this.anInt1979 == this.anInt1973) {
			this.aBoolean135 = this.aClass8_Sub49Array1[arg0] == null;
			this.aClass8_Sub49Array1[arg0] = Static635.aClass8_Sub49_1;
			return this.anIntArrayArray4[arg0];
		} else if (this.anInt1973 == 1) {
			this.aBoolean135 = this.anInt1982 != arg0;
			this.anInt1982 = arg0;
			return this.anIntArrayArray4[0];
		} else {
			@Pc(50) Class8_Sub49 local50 = this.aClass8_Sub49Array1[arg0];
			if (local50 == null) {
				this.aBoolean135 = true;
				if (this.anInt1973 > this.anInt1974) {
					local50 = new Class8_Sub49(arg0, this.anInt1974);
					this.anInt1974++;
				} else {
					@Pc(81) Class8_Sub49 local81 = (Class8_Sub49) this.aClass43_16.method1421();
					local50 = new Class8_Sub49(arg0, local81.anInt10156);
					this.aClass8_Sub49Array1[local81.anInt10157] = null;
					local81.method8640();
				}
				this.aClass8_Sub49Array1[arg0] = local50;
			} else {
				this.aBoolean135 = false;
			}
			this.aClass43_16.method1434(local50);
			return this.anIntArrayArray4[local50.anInt10156];
		}
	}

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
	public void method1689() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt1973; local7++) {
			this.anIntArrayArray4[local7] = null;
		}
		this.aClass8_Sub49Array1 = null;
		this.anIntArrayArray4 = null;
		this.aClass43_16.method1431();
		this.aClass43_16 = null;
	}

	@OriginalMember(owner = "client!cd", name = "c", descriptor = "(B)[[I")
	public int[][] method1693() {
		if (this.anInt1973 != this.anInt1979) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt1973; local26++) {
			this.aClass8_Sub49Array1[local26] = Static635.aClass8_Sub49_1;
		}
		return this.anIntArrayArray4;
	}
}
