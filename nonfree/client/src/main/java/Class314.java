import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class314 {

	@OriginalMember(owner = "client!td", name = "f", descriptor = "I")
	private int anInt8422 = -1;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "I")
	private int anInt8426 = 0;

	@OriginalMember(owner = "client!td", name = "k", descriptor = "Lclient!ae;")
	private Class8 aClass8_59 = new Class8();

	@OriginalMember(owner = "client!td", name = "p", descriptor = "Z")
	public boolean aBoolean653 = false;

	@OriginalMember(owner = "client!td", name = "o", descriptor = "I")
	private final int anInt8427;

	@OriginalMember(owner = "client!td", name = "d", descriptor = "I")
	private final int anInt8420;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "[Lclient!jk;")
	private Class2_Sub26[] aClass2_Sub26Array1;

	@OriginalMember(owner = "client!td", name = "h", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray28;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(III)V")
	public Class314(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8427 = arg1;
		this.anInt8420 = arg0;
		this.aClass2_Sub26Array1 = new Class2_Sub26[this.anInt8427];
		this.anIntArrayArrayArray28 = new int[this.anInt8420][3][arg2];
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)[[I")
	public int[][] method7006(@OriginalArg(0) int arg0) {
		if (this.anInt8427 == this.anInt8420) {
			this.aBoolean653 = this.aClass2_Sub26Array1[arg0] == null;
			this.aClass2_Sub26Array1[arg0] = Static28.aClass2_Sub26_4;
			return this.anIntArrayArrayArray28[arg0];
		} else if (this.anInt8420 == 1) {
			this.aBoolean653 = this.anInt8422 != arg0;
			this.anInt8422 = arg0;
			return this.anIntArrayArrayArray28[0];
		} else {
			@Pc(27) Class2_Sub26 local27 = this.aClass2_Sub26Array1[arg0];
			if (local27 == null) {
				this.aBoolean653 = true;
				if (this.anInt8420 <= this.anInt8426) {
					@Pc(43) Class2_Sub26 local43 = (Class2_Sub26) this.aClass8_59.method221();
					local27 = new Class2_Sub26(arg0, local43.anInt4691);
					this.aClass2_Sub26Array1[local43.anInt4689] = null;
					local43.method7966();
				} else {
					local27 = new Class2_Sub26(arg0, this.anInt8426);
					this.anInt8426++;
				}
				this.aClass2_Sub26Array1[arg0] = local27;
			} else {
				this.aBoolean653 = false;
			}
			this.aClass8_59.method209(local27);
			return this.anIntArrayArrayArray28[local27.anInt4691];
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I)[[[I")
	public int[][][] method7007() {
		if (this.anInt8420 != this.anInt8427) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt8420; local21++) {
			this.aClass2_Sub26Array1[local21] = Static28.aClass2_Sub26_4;
		}
		return this.anIntArrayArrayArray28;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public void method7009() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt8420; local15++) {
			this.anIntArrayArrayArray28[local15][0] = null;
			this.anIntArrayArrayArray28[local15][1] = null;
			this.anIntArrayArrayArray28[local15][2] = null;
			this.anIntArrayArrayArray28[local15] = null;
		}
		this.aClass2_Sub26Array1 = null;
		this.anIntArrayArrayArray28 = null;
		this.aClass8_59.method220();
		this.aClass8_59 = null;
	}
}
