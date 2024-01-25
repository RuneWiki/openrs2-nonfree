import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bq")
public final class Class36 {

	@OriginalMember(owner = "client!bq", name = "j", descriptor = "I")
	private int anInt934 = 0;

	@OriginalMember(owner = "client!bq", name = "q", descriptor = "I")
	private int anInt931 = -1;

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "Lclient!tj;")
	private Class357 aClass357_4 = new Class357();

	@OriginalMember(owner = "client!bq", name = "o", descriptor = "Z")
	public boolean aBoolean75 = false;

	@OriginalMember(owner = "client!bq", name = "p", descriptor = "I")
	private final int anInt935;

	@OriginalMember(owner = "client!bq", name = "i", descriptor = "I")
	private final int anInt927;

	@OriginalMember(owner = "client!bq", name = "l", descriptor = "[Lclient!pn;")
	private Class3_Sub44[] aClass3_Sub44Array1;

	@OriginalMember(owner = "client!bq", name = "r", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray1;

	@OriginalMember(owner = "client!bq", name = "<init>", descriptor = "(III)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt935 = arg1;
		this.anInt927 = arg0;
		this.aClass3_Sub44Array1 = new Class3_Sub44[this.anInt935];
		this.anIntArrayArrayArray1 = new int[this.anInt927][3][arg2];
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(I)V")
	public void method730() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt927; local3++) {
			this.anIntArrayArrayArray1[local3][0] = null;
			this.anIntArrayArrayArray1[local3][1] = null;
			this.anIntArrayArrayArray1[local3][2] = null;
			this.anIntArrayArrayArray1[local3] = null;
		}
		this.aClass3_Sub44Array1 = null;
		this.anIntArrayArrayArray1 = null;
		this.aClass357_4.method8403();
		this.aClass357_4 = null;
	}

	@OriginalMember(owner = "client!bq", name = "a", descriptor = "(II)[[I")
	public int[][] method731(@OriginalArg(0) int arg0) {
		if (this.anInt935 == this.anInt927) {
			this.aBoolean75 = this.aClass3_Sub44Array1[arg0] == null;
			this.aClass3_Sub44Array1[arg0] = Static609.aClass3_Sub44_1;
			return this.anIntArrayArrayArray1[arg0];
		} else if (this.anInt927 == 1) {
			this.aBoolean75 = this.anInt931 != arg0;
			this.anInt931 = arg0;
			return this.anIntArrayArrayArray1[0];
		} else {
			@Pc(50) Class3_Sub44 local50 = this.aClass3_Sub44Array1[arg0];
			if (local50 == null) {
				this.aBoolean75 = true;
				if (this.anInt927 <= this.anInt934) {
					@Pc(75) Class3_Sub44 local75 = (Class3_Sub44) this.aClass357_4.method8390();
					local50 = new Class3_Sub44(arg0, local75.anInt8521);
					this.aClass3_Sub44Array1[local75.anInt8519] = null;
					local75.method9446();
				} else {
					local50 = new Class3_Sub44(arg0, this.anInt934);
					this.anInt934++;
				}
				this.aClass3_Sub44Array1[arg0] = local50;
			} else {
				this.aBoolean75 = false;
			}
			this.aClass357_4.method8400(local50);
			return this.anIntArrayArrayArray1[local50.anInt8521];
		}
	}

	@OriginalMember(owner = "client!bq", name = "c", descriptor = "(B)[[[I")
	public int[][][] method734() {
		if (this.anInt927 != this.anInt935) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(24) int local24 = 0; local24 < this.anInt927; local24++) {
			this.aClass3_Sub44Array1[local24] = Static609.aClass3_Sub44_1;
		}
		return this.anIntArrayArrayArray1;
	}
}
