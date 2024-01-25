import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class187 {

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
	private int anInt5253 = -1;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
	private int anInt5252 = 0;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!ws;")
	private Class361 aClass361_44 = new Class361();

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Z")
	public boolean aBoolean374 = false;

	@OriginalMember(owner = "client!lb", name = "e", descriptor = "I")
	private final int anInt5255;

	@OriginalMember(owner = "client!lb", name = "h", descriptor = "I")
	private final int anInt5257;

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "[Lclient!vh;")
	private Class6_Sub50[] aClass6_Sub50Array1;

	@OriginalMember(owner = "client!lb", name = "d", descriptor = "[[I")
	private int[][] anIntArrayArray42;

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(III)V")
	public Class187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5255 = arg0;
		this.anInt5257 = arg1;
		this.aClass6_Sub50Array1 = new Class6_Sub50[this.anInt5257];
		this.anIntArrayArray42 = new int[this.anInt5255][arg2];
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(B)V")
	public void method4556() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5255; local7++) {
			this.anIntArrayArray42[local7] = null;
		}
		this.anIntArrayArray42 = null;
		this.aClass6_Sub50Array1 = null;
		this.aClass361_44.method7842();
		this.aClass361_44 = null;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)[[I")
	public int[][] method4557() {
		if (this.anInt5257 != this.anInt5255) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt5255; local21++) {
			this.aClass6_Sub50Array1[local21] = Static185.aClass6_Sub50_1;
		}
		return this.anIntArrayArray42;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IB)[I")
	public int[] method4558(@OriginalArg(0) int arg0) {
		if (this.anInt5257 == this.anInt5255) {
			this.aBoolean374 = this.aClass6_Sub50Array1[arg0] == null;
			this.aClass6_Sub50Array1[arg0] = Static185.aClass6_Sub50_1;
			return this.anIntArrayArray42[arg0];
		} else if (this.anInt5255 == 1) {
			this.aBoolean374 = arg0 != this.anInt5253;
			this.anInt5253 = arg0;
			return this.anIntArrayArray42[0];
		} else {
			@Pc(31) Class6_Sub50 local31 = this.aClass6_Sub50Array1[arg0];
			if (local31 == null) {
				this.aBoolean374 = true;
				if (this.anInt5252 >= this.anInt5255) {
					@Pc(56) Class6_Sub50 local56 = (Class6_Sub50) this.aClass361_44.method7840();
					local31 = new Class6_Sub50(arg0, local56.anInt9263);
					this.aClass6_Sub50Array1[local56.anInt9262] = null;
					local56.method7804();
				} else {
					local31 = new Class6_Sub50(arg0, this.anInt5252);
					this.anInt5252++;
				}
				this.aClass6_Sub50Array1[arg0] = local31;
			} else {
				this.aBoolean374 = false;
			}
			this.aClass361_44.method7836(local31);
			return this.anIntArrayArray42[local31.anInt9263];
		}
	}
}
