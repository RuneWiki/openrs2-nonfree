import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class8 {

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
	private int anInt145 = -1;

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "I")
	private int anInt146 = 0;

	@OriginalMember(owner = "client!ah", name = "i", descriptor = "Lclient!ab;")
	private Class3 aClass3_1 = new Class3();

	@OriginalMember(owner = "client!ah", name = "r", descriptor = "Z")
	public boolean aBoolean6 = false;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "I")
	private int anInt148;

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "[[I")
	private int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
	private int anInt147;

	@OriginalMember(owner = "client!ah", name = "k", descriptor = "[Lclient!fb;")
	private Class1_Sub9[] aClass1_Sub9Array1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(III)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt148 = arg0;
		this.anIntArrayArray1 = new int[this.anInt148][arg2];
		this.anInt147 = arg1;
		this.aClass1_Sub9Array1 = new Class1_Sub9[this.anInt147];
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)[[I")
	public int[][] method107() {
		if (this.anInt147 != this.anInt148) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(26) int local26 = 0; local26 < this.anInt148; local26++) {
			this.aClass1_Sub9Array1[local26] = Static54.aClass1_Sub9_1;
		}
		return this.anIntArrayArray1;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(I)V")
	public void method109() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt148; local3++) {
			this.anIntArrayArray1[local3] = null;
		}
		this.aClass1_Sub9Array1 = null;
		this.anIntArrayArray1 = null;
		this.aClass3_1.method29();
		this.aClass3_1 = null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IZ)[I")
	public int[] method111(@OriginalArg(0) int arg0) {
		if (this.anInt148 == this.anInt147) {
			this.aBoolean6 = this.aClass1_Sub9Array1[arg0] == null;
			this.aClass1_Sub9Array1[arg0] = Static54.aClass1_Sub9_1;
			return this.anIntArrayArray1[arg0];
		} else if (this.anInt148 == 1) {
			this.aBoolean6 = this.anInt145 != arg0;
			this.anInt145 = arg0;
			return this.anIntArrayArray1[0];
		} else {
			@Pc(49) Class1_Sub9 local49 = this.aClass1_Sub9Array1[arg0];
			if (local49 == null) {
				this.aBoolean6 = true;
				if (this.anInt146 >= this.anInt148) {
					@Pc(65) Class1_Sub9 local65 = (Class1_Sub9) this.aClass3_1.method32();
					local49 = new Class1_Sub9(arg0, local65.anInt1835);
					this.aClass1_Sub9Array1[local65.anInt1834] = null;
					local65.method4186();
				} else {
					local49 = new Class1_Sub9(arg0, this.anInt146);
					this.anInt146++;
				}
				this.aClass1_Sub9Array1[arg0] = local49;
			} else {
				this.aBoolean6 = false;
			}
			this.aClass3_1.method31(local49);
			return this.anIntArrayArray1[local49.anInt1835];
		}
	}
}
