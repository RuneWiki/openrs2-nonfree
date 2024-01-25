import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uq")
public final class Class14_Sub48 extends Class14 {

	@OriginalMember(owner = "client!uq", name = "C", descriptor = "[I")
	private int[] anIntArray555;

	@OriginalMember(owner = "client!uq", name = "v", descriptor = "B")
	public byte aByte135;

	@OriginalMember(owner = "client!uq", name = "s", descriptor = "[Lclient!hi;")
	public Class155[] aClass155Array1;

	@OriginalMember(owner = "client!uq", name = "o", descriptor = "B")
	public byte aByte136;

	@OriginalMember(owner = "client!uq", name = "m", descriptor = "Z")
	private boolean aBoolean724;

	@OriginalMember(owner = "client!uq", name = "x", descriptor = "J")
	public long aLong292;

	@OriginalMember(owner = "client!uq", name = "A", descriptor = "Ljava/lang/String;")
	public String aString118 = null;

	@OriginalMember(owner = "client!uq", name = "t", descriptor = "I")
	public int anInt10291 = 0;

	@OriginalMember(owner = "client!uq", name = "w", descriptor = "Z")
	private boolean aBoolean723 = true;

	@OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class14_Sub48(@OriginalArg(0) Class14_Sub21 arg0) {
		this.method8805(arg0);
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(II)V")
	private void method8801(@OriginalArg(0) int arg0) {
		if (this.aClass155Array1 == null) {
			this.aClass155Array1 = new Class155[arg0];
		} else {
			Static691.method86(this.aClass155Array1, 0, this.aClass155Array1 = new Class155[arg0], 0, this.anInt10291);
		}
	}

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "(I)[I")
	public int[] method8802() {
		if (this.anIntArray555 == null) {
			@Pc(6) String[] local6 = new String[this.anInt10291];
			this.anIntArray555 = new int[this.anInt10291];
			@Pc(13) int local13 = 0;
			while (local13 < this.anInt10291) {
				local6[local13] = this.aClass155Array1[local13].aString45;
				this.anIntArray555[local13] = local13++;
			}
			Static214.method3272(local6, this.anIntArray555);
		}
		return this.anIntArray555;
	}

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(II)V")
	public void method8804(@OriginalArg(0) int arg0) {
		this.anInt10291--;
		if (this.anInt10291 == 0) {
			this.aClass155Array1 = null;
		} else {
			Static691.method86(this.aClass155Array1, arg0 + 1, this.aClass155Array1, arg0, this.anInt10291 - arg0);
		}
		this.anIntArray555 = null;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!jc;B)V")
	private void method8805(@OriginalArg(0) Class14_Sub21 arg0) {
		@Pc(17) int local17 = arg0.method7695(98);
		if ((local17 & 0x1) != 0) {
			this.aBoolean724 = true;
		}
		if ((local17 & 0x2) != 0) {
			this.aBoolean723 = true;
		}
		super.aLong324 = arg0.method7729();
		this.aLong292 = arg0.method7729();
		this.aString118 = arg0.method7703(0);
		arg0.method7695(111);
		this.aByte136 = arg0.method7720();
		this.aByte135 = arg0.method7720();
		this.anInt10291 = arg0.method7717(-1978450544);
		if (this.anInt10291 <= 0) {
			return;
		}
		this.aClass155Array1 = new Class155[this.anInt10291];
		for (@Pc(79) int local79 = 0; local79 < this.anInt10291; local79++) {
			@Pc(85) Class155 local85 = new Class155();
			if (this.aBoolean724) {
				arg0.method7729();
			}
			if (this.aBoolean723) {
				local85.aString45 = arg0.method7703(0);
			}
			local85.aByte85 = arg0.method7720();
			local85.anInt4349 = arg0.method7717(-1978450544);
			this.aClass155Array1[local79] = local85;
		}
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!hi;I)V")
	public void method8806(@OriginalArg(0) Class155 arg0) {
		if (this.aClass155Array1 == null || this.aClass155Array1.length <= this.anInt10291) {
			this.method8801(this.anInt10291 + 5);
		}
		this.aClass155Array1[this.anInt10291++] = arg0;
		this.anIntArray555 = null;
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method8807(@OriginalArg(0) String arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.anInt10291; local11++) {
			if (this.aClass155Array1[local11].aString45.equalsIgnoreCase(arg0)) {
				return local11;
			}
		}
		return -1;
	}
}
