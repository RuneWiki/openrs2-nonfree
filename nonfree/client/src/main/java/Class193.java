import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kq")
public final class Class193 {

	@OriginalMember(owner = "client!kq", name = "i", descriptor = "I")
	private int anInt5349 = -1;

	@OriginalMember(owner = "client!kq", name = "q", descriptor = "I")
	private int anInt5354 = 0;

	@OriginalMember(owner = "client!kq", name = "h", descriptor = "Lclient!mr;")
	private Class223 aClass223_24 = new Class223();

	@OriginalMember(owner = "client!kq", name = "t", descriptor = "Z")
	public boolean aBoolean358 = false;

	@OriginalMember(owner = "client!kq", name = "j", descriptor = "I")
	private final int anInt5350;

	@OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
	private final int anInt5353;

	@OriginalMember(owner = "client!kq", name = "p", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray11;

	@OriginalMember(owner = "client!kq", name = "s", descriptor = "[Lclient!ml;")
	private Class3_Sub37[] aClass3_Sub37Array1;

	@OriginalMember(owner = "client!kq", name = "<init>", descriptor = "(III)V")
	public Class193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5350 = arg1;
		this.anInt5353 = arg0;
		this.anIntArrayArrayArray11 = new int[this.anInt5353][3][arg2];
		this.aClass3_Sub37Array1 = new Class3_Sub37[this.anInt5350];
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)[[[I")
	public int[][][] method4795() {
		if (this.anInt5353 != this.anInt5350) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt5353; local21++) {
			this.aClass3_Sub37Array1[local21] = Static608.aClass3_Sub37_1;
		}
		return this.anIntArrayArrayArray11;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Z)V")
	public void method4798() {
		for (@Pc(7) int local7 = 0; local7 < this.anInt5353; local7++) {
			this.anIntArrayArrayArray11[local7][0] = null;
			this.anIntArrayArrayArray11[local7][1] = null;
			this.anIntArrayArrayArray11[local7][2] = null;
			this.anIntArrayArrayArray11[local7] = null;
		}
		this.anIntArrayArrayArray11 = null;
		this.aClass3_Sub37Array1 = null;
		this.aClass223_24.method5862();
		this.aClass223_24 = null;
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IZ)[[I")
	public int[][] method4800(@OriginalArg(0) int arg0) {
		if (this.anInt5353 == this.anInt5350) {
			this.aBoolean358 = this.aClass3_Sub37Array1[arg0] == null;
			this.aClass3_Sub37Array1[arg0] = Static608.aClass3_Sub37_1;
			return this.anIntArrayArrayArray11[arg0];
		} else if (this.anInt5353 == 1) {
			this.aBoolean358 = this.anInt5349 != arg0;
			this.anInt5349 = arg0;
			return this.anIntArrayArrayArray11[0];
		} else {
			@Pc(24) Class3_Sub37 local24 = this.aClass3_Sub37Array1[arg0];
			if (local24 == null) {
				this.aBoolean358 = true;
				if (this.anInt5354 >= this.anInt5353) {
					@Pc(45) Class3_Sub37 local45 = (Class3_Sub37) this.aClass223_24.method5873();
					local24 = new Class3_Sub37(arg0, local45.anInt6766);
					this.aClass3_Sub37Array1[local45.anInt6761] = null;
					local45.method8769();
				} else {
					local24 = new Class3_Sub37(arg0, this.anInt5354);
					this.anInt5354++;
				}
				this.aClass3_Sub37Array1[arg0] = local24;
			} else {
				this.aBoolean358 = false;
			}
			this.aClass223_24.method5867(local24);
			return this.anIntArrayArrayArray11[local24.anInt6766];
		}
	}
}
