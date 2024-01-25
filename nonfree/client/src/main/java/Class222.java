import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pba")
public final class Class222 {

	@OriginalMember(owner = "client!pba", name = "e", descriptor = "I")
	private int anInt6580 = 0;

	@OriginalMember(owner = "client!pba", name = "h", descriptor = "I")
	private int anInt6581 = -1;

	@OriginalMember(owner = "client!pba", name = "g", descriptor = "Lclient!ui;")
	private Class295 aClass295_38 = new Class295();

	@OriginalMember(owner = "client!pba", name = "n", descriptor = "Z")
	public boolean aBoolean485 = false;

	@OriginalMember(owner = "client!pba", name = "d", descriptor = "I")
	private final int anInt6579;

	@OriginalMember(owner = "client!pba", name = "l", descriptor = "I")
	private final int anInt6584;

	@OriginalMember(owner = "client!pba", name = "f", descriptor = "[[I")
	private int[][] anIntArrayArray88;

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "[Lclient!nd;")
	private Class1_Sub39[] aClass1_Sub39Array1;

	@OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(III)V")
	public Class222(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt6579 = arg0;
		this.anInt6584 = arg1;
		this.anIntArrayArray88 = new int[this.anInt6579][arg2];
		this.aClass1_Sub39Array1 = new Class1_Sub39[this.anInt6584];
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(BI)[I")
	public int[] method5913(@OriginalArg(1) int arg0) {
		if (this.anInt6579 == this.anInt6584) {
			this.aBoolean485 = this.aClass1_Sub39Array1[arg0] == null;
			this.aClass1_Sub39Array1[arg0] = Static63.aClass1_Sub39_1;
			return this.anIntArrayArray88[arg0];
		} else if (this.anInt6579 == 1) {
			this.aBoolean485 = this.anInt6581 != arg0;
			this.anInt6581 = arg0;
			return this.anIntArrayArray88[0];
		} else {
			@Pc(50) Class1_Sub39 local50 = this.aClass1_Sub39Array1[arg0];
			if (local50 == null) {
				this.aBoolean485 = true;
				if (this.anInt6579 <= this.anInt6580) {
					@Pc(75) Class1_Sub39 local75 = (Class1_Sub39) this.aClass295_38.method7535();
					local50 = new Class1_Sub39(arg0, local75.anInt6023);
					this.aClass1_Sub39Array1[local75.anInt6022] = null;
					local75.method8239();
				} else {
					local50 = new Class1_Sub39(arg0, this.anInt6580);
					this.anInt6580++;
				}
				this.aClass1_Sub39Array1[arg0] = local50;
			} else {
				this.aBoolean485 = false;
			}
			this.aClass295_38.method7546(local50);
			return this.anIntArrayArray88[local50.anInt6023];
		}
	}

	@OriginalMember(owner = "client!pba", name = "a", descriptor = "(Z)[[I")
	public int[][] method5915() {
		if (this.anInt6579 != this.anInt6584) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt6579; local17++) {
			this.aClass1_Sub39Array1[local17] = Static63.aClass1_Sub39_1;
		}
		return this.anIntArrayArray88;
	}

	@OriginalMember(owner = "client!pba", name = "b", descriptor = "(B)V")
	public void method5917() {
		for (@Pc(9) int local9 = 0; local9 < this.anInt6579; local9++) {
			this.anIntArrayArray88[local9] = null;
		}
		this.aClass1_Sub39Array1 = null;
		this.anIntArrayArray88 = null;
		this.aClass295_38.method7541();
		this.aClass295_38 = null;
	}
}
