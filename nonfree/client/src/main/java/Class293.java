import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class293 {

	@OriginalMember(owner = "client!ps", name = "g", descriptor = "I")
	private int anInt8582 = -1;

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "I")
	private int anInt8577 = 0;

	@OriginalMember(owner = "client!ps", name = "i", descriptor = "Lclient!tj;")
	private Class357 aClass357_52 = new Class357();

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "Z")
	public boolean aBoolean641 = false;

	@OriginalMember(owner = "client!ps", name = "n", descriptor = "I")
	private final int anInt8576;

	@OriginalMember(owner = "client!ps", name = "h", descriptor = "I")
	private final int anInt8580;

	@OriginalMember(owner = "client!ps", name = "l", descriptor = "[Lclient!ab;")
	private Class3_Sub1[] aClass3_Sub1Array1;

	@OriginalMember(owner = "client!ps", name = "e", descriptor = "[[I")
	private int[][] anIntArrayArray48;

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "(III)V")
	public Class293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8576 = arg1;
		this.anInt8580 = arg0;
		this.aClass3_Sub1Array1 = new Class3_Sub1[this.anInt8576];
		this.anIntArrayArray48 = new int[this.anInt8580][arg2];
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
	public void method7198() {
		for (@Pc(15) int local15 = 0; local15 < this.anInt8580; local15++) {
			this.anIntArrayArray48[local15] = null;
		}
		this.anIntArrayArray48 = null;
		this.aClass3_Sub1Array1 = null;
		this.aClass357_52.method8403();
		this.aClass357_52 = null;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(IB)[I")
	public int[] method7200(@OriginalArg(0) int arg0) {
		if (this.anInt8576 == this.anInt8580) {
			this.aBoolean641 = this.aClass3_Sub1Array1[arg0] == null;
			this.aClass3_Sub1Array1[arg0] = Static390.aClass3_Sub1_1;
			return this.anIntArrayArray48[arg0];
		} else if (this.anInt8580 == 1) {
			this.aBoolean641 = this.anInt8582 != arg0;
			this.anInt8582 = arg0;
			return this.anIntArrayArray48[0];
		} else {
			@Pc(50) Class3_Sub1 local50 = this.aClass3_Sub1Array1[arg0];
			if (local50 == null) {
				this.aBoolean641 = true;
				if (this.anInt8577 < this.anInt8580) {
					local50 = new Class3_Sub1(arg0, this.anInt8577);
					this.anInt8577++;
				} else {
					@Pc(90) Class3_Sub1 local90 = (Class3_Sub1) this.aClass357_52.method8390();
					local50 = new Class3_Sub1(arg0, local90.anInt27);
					this.aClass3_Sub1Array1[local90.anInt31] = null;
					local90.method9446();
				}
				this.aClass3_Sub1Array1[arg0] = local50;
			} else {
				this.aBoolean641 = false;
			}
			this.aClass357_52.method8400(local50);
			return this.anIntArrayArray48[local50.anInt27];
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)[[I")
	public int[][] method7202() {
		if (this.anInt8576 != this.anInt8580) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt8580; local27++) {
			this.aClass3_Sub1Array1[local27] = Static390.aClass3_Sub1_1;
		}
		return this.anIntArrayArray48;
	}
}
