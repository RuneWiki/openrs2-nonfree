import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class109 {

	@OriginalMember(owner = "client!im", name = "g", descriptor = "I")
	private int anInt3293 = 0;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "I")
	private int anInt3295 = -1;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "Lclient!ps;")
	private Class193 aClass193_27 = new Class193();

	@OriginalMember(owner = "client!im", name = "m", descriptor = "Z")
	public boolean aBoolean250 = false;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	private final int anInt3296;

	@OriginalMember(owner = "client!im", name = "f", descriptor = "I")
	private final int anInt3292;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "[Lclient!or;")
	private Class3_Sub36[] aClass3_Sub36Array1;

	@OriginalMember(owner = "client!im", name = "b", descriptor = "[[I")
	private int[][] anIntArrayArray22;

	static {
		new Class174("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(III)V")
	public Class109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt3296 = arg1;
		this.anInt3292 = arg0;
		this.aClass3_Sub36Array1 = new Class3_Sub36[this.anInt3296];
		this.anIntArrayArray22 = new int[this.anInt3292][arg2];
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[I")
	public int[] method2831(@OriginalArg(0) int arg0) {
		if (this.anInt3292 == this.anInt3296) {
			this.aBoolean250 = this.aClass3_Sub36Array1[arg0] == null;
			this.aClass3_Sub36Array1[arg0] = Static159.aClass3_Sub36_1;
			return this.anIntArrayArray22[arg0];
		} else if (this.anInt3292 == 1) {
			this.aBoolean250 = arg0 != this.anInt3295;
			this.anInt3295 = arg0;
			return this.anIntArrayArray22[0];
		} else {
			@Pc(54) Class3_Sub36 local54 = this.aClass3_Sub36Array1[arg0];
			if (local54 == null) {
				this.aBoolean250 = true;
				if (this.anInt3292 > this.anInt3293) {
					local54 = new Class3_Sub36(arg0, this.anInt3293);
					this.anInt3293++;
				} else {
					@Pc(90) Class3_Sub36 local90 = (Class3_Sub36) this.aClass193_27.method4531();
					local54 = new Class3_Sub36(arg0, local90.anInt5236);
					this.aClass3_Sub36Array1[local90.anInt5234] = null;
					local90.method6288();
				}
				this.aClass3_Sub36Array1[arg0] = local54;
			} else {
				this.aBoolean250 = false;
			}
			this.aClass193_27.method4522(local54);
			return this.anIntArrayArray22[local54.anInt5236];
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(I)[[I")
	public int[][] method2832() {
		if (this.anInt3296 != this.anInt3292) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt3292; local27++) {
			this.aClass3_Sub36Array1[local27] = Static159.aClass3_Sub36_1;
		}
		return this.anIntArrayArray22;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)V")
	public void method2833() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt3292; local3++) {
			this.anIntArrayArray22[local3] = null;
		}
		this.aClass3_Sub36Array1 = null;
		this.anIntArrayArray22 = null;
		this.aClass193_27.method4524();
		this.aClass193_27 = null;
	}
}
