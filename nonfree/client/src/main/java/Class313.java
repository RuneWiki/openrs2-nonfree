import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class313 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "I")
	private int anInt9386 = -1;

	@OriginalMember(owner = "client!tm", name = "k", descriptor = "I")
	private int anInt9390 = 0;

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "Lclient!ki;")
	private Class183 aClass183_56 = new Class183();

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "Z")
	public boolean aBoolean787 = false;

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
	private final int anInt9385;

	@OriginalMember(owner = "client!tm", name = "j", descriptor = "I")
	private final int anInt9389;

	@OriginalMember(owner = "client!tm", name = "h", descriptor = "[Lclient!uc;")
	private Class3_Sub47[] aClass3_Sub47Array1;

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray77;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(III)V")
	public Class313(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt9385 = arg1;
		this.anInt9389 = arg0;
		this.aClass3_Sub47Array1 = new Class3_Sub47[this.anInt9385];
		this.anIntArrayArray77 = new int[this.anInt9389][arg2];
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)[[I")
	public int[][] method7615() {
		if (this.anInt9385 != this.anInt9389) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(17) int local17 = 0; local17 < this.anInt9389; local17++) {
			this.aClass3_Sub47Array1[local17] = Static443.aClass3_Sub47_1;
		}
		return this.anIntArrayArray77;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)V")
	public void method7616() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt9389; local7++) {
			this.anIntArrayArray77[local7] = null;
		}
		this.anIntArrayArray77 = null;
		this.aClass3_Sub47Array1 = null;
		this.aClass183_56.method4790();
		this.aClass183_56 = null;
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(IB)[I")
	public int[] method7619(@OriginalArg(0) int arg0) {
		if (this.anInt9389 == this.anInt9385) {
			this.aBoolean787 = this.aClass3_Sub47Array1[arg0] == null;
			this.aClass3_Sub47Array1[arg0] = Static443.aClass3_Sub47_1;
			return this.anIntArrayArray77[arg0];
		} else if (this.anInt9389 == 1) {
			this.aBoolean787 = this.anInt9386 != arg0;
			this.anInt9386 = arg0;
			return this.anIntArrayArray77[0];
		} else {
			@Pc(45) Class3_Sub47 local45 = this.aClass3_Sub47Array1[arg0];
			if (local45 == null) {
				this.aBoolean787 = true;
				if (this.anInt9390 < this.anInt9389) {
					local45 = new Class3_Sub47(arg0, this.anInt9390);
					this.anInt9390++;
				} else {
					@Pc(83) Class3_Sub47 local83 = (Class3_Sub47) this.aClass183_56.method4786();
					local45 = new Class3_Sub47(arg0, local83.anInt9573);
					this.aClass3_Sub47Array1[local83.anInt9569] = null;
					local83.method8412();
				}
				this.aClass3_Sub47Array1[arg0] = local45;
			} else {
				this.aBoolean787 = false;
			}
			this.aClass183_56.method4787(local45);
			return this.anIntArrayArray77[local45.anInt9573];
		}
	}
}
