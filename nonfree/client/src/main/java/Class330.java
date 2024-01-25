import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class330 {

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
	private int anInt9642 = -1;

	@OriginalMember(owner = "client!uea", name = "i", descriptor = "I")
	private int anInt9647 = 0;

	@OriginalMember(owner = "client!uea", name = "p", descriptor = "Lclient!qia;")
	private Class276 aClass276_58 = new Class276();

	@OriginalMember(owner = "client!uea", name = "q", descriptor = "Z")
	public boolean aBoolean806 = false;

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
	private final int anInt9646;

	@OriginalMember(owner = "client!uea", name = "g", descriptor = "I")
	private final int anInt9645;

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "[Lclient!qf;")
	private Class3_Sub39[] aClass3_Sub39Array1;

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray96;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(III)V")
	public Class330(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9646 = arg0;
		this.anInt9645 = arg1;
		this.aClass3_Sub39Array1 = new Class3_Sub39[this.anInt9645];
		this.anIntArrayArray96 = new int[this.anInt9646][arg2];
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Z)V")
	public void method7980() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt9646; local3++) {
			this.anIntArrayArray96[local3] = null;
		}
		this.aClass3_Sub39Array1 = null;
		this.anIntArrayArray96 = null;
		this.aClass276_58.method6910();
		this.aClass276_58 = null;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(B)[[I")
	public int[][] method7982() {
		if (this.anInt9646 != this.anInt9645) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt9646; local17++) {
			this.aClass3_Sub39Array1[local17] = Static202.aClass3_Sub39_1;
		}
		return this.anIntArrayArray96;
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)[I")
	public int[] method7983(@OriginalArg(0) int arg0) {
		if (this.anInt9646 == this.anInt9645) {
			this.aBoolean806 = this.aClass3_Sub39Array1[arg0] == null;
			this.aClass3_Sub39Array1[arg0] = Static202.aClass3_Sub39_1;
			return this.anIntArrayArray96[arg0];
		} else if (this.anInt9646 == 1) {
			this.aBoolean806 = arg0 != this.anInt9642;
			this.anInt9642 = arg0;
			return this.anIntArrayArray96[0];
		} else {
			@Pc(63) Class3_Sub39 local63 = this.aClass3_Sub39Array1[arg0];
			if (local63 == null) {
				this.aBoolean806 = true;
				if (this.anInt9647 >= this.anInt9646) {
					@Pc(79) Class3_Sub39 local79 = (Class3_Sub39) this.aClass276_58.method6915();
					local63 = new Class3_Sub39(arg0, local79.anInt8232);
					this.aClass3_Sub39Array1[local79.anInt8234] = null;
					local79.method8671();
				} else {
					local63 = new Class3_Sub39(arg0, this.anInt9647);
					this.anInt9647++;
				}
				this.aClass3_Sub39Array1[arg0] = local63;
			} else {
				this.aBoolean806 = false;
			}
			this.aClass276_58.method6905(local63);
			return this.anIntArrayArray96[local63.anInt8232];
		}
	}
}
