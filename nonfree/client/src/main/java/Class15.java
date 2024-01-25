import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aw")
public final class Class15 {

	@OriginalMember(owner = "client!aw", name = "f", descriptor = "I")
	private int anInt519 = 0;

	@OriginalMember(owner = "client!aw", name = "o", descriptor = "I")
	private int anInt526 = -1;

	@OriginalMember(owner = "client!aw", name = "d", descriptor = "Lclient!oe;")
	private Class181 aClass181_5 = new Class181();

	@OriginalMember(owner = "client!aw", name = "s", descriptor = "Z")
	public boolean aBoolean17 = false;

	@OriginalMember(owner = "client!aw", name = "m", descriptor = "I")
	private final int anInt524;

	@OriginalMember(owner = "client!aw", name = "e", descriptor = "I")
	private final int anInt518;

	@OriginalMember(owner = "client!aw", name = "i", descriptor = "[Lclient!ro;")
	private Class1_Sub38[] aClass1_Sub38Array1;

	@OriginalMember(owner = "client!aw", name = "c", descriptor = "[[I")
	private int[][] anIntArrayArray4;

	@OriginalMember(owner = "client!aw", name = "<init>", descriptor = "(III)V")
	public Class15(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt524 = arg0;
		this.anInt518 = arg1;
		this.aClass1_Sub38Array1 = new Class1_Sub38[this.anInt518];
		this.anIntArrayArray4 = new int[this.anInt524][arg2];
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(I)V")
	public void method505() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt524; local3++) {
			this.anIntArrayArray4[local3] = null;
		}
		this.aClass1_Sub38Array1 = null;
		this.anIntArrayArray4 = null;
		this.aClass181_5.method4101();
		this.aClass181_5 = null;
	}

	@OriginalMember(owner = "client!aw", name = "b", descriptor = "(I)[[I")
	public int[][] method507() {
		if (this.anInt524 != this.anInt518) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(21) int local21 = 0; local21 < this.anInt524; local21++) {
			this.aClass1_Sub38Array1[local21] = Static330.aClass1_Sub38_1;
		}
		return this.anIntArrayArray4;
	}

	@OriginalMember(owner = "client!aw", name = "a", descriptor = "(II)[I")
	public int[] method508(@OriginalArg(0) int arg0) {
		if (this.anInt524 == this.anInt518) {
			this.aBoolean17 = this.aClass1_Sub38Array1[arg0] == null;
			this.aClass1_Sub38Array1[arg0] = Static330.aClass1_Sub38_1;
			return this.anIntArrayArray4[arg0];
		} else if (this.anInt524 == 1) {
			this.aBoolean17 = this.anInt526 != arg0;
			this.anInt526 = arg0;
			return this.anIntArrayArray4[0];
		} else {
			@Pc(48) Class1_Sub38 local48 = this.aClass1_Sub38Array1[arg0];
			if (local48 == null) {
				this.aBoolean17 = true;
				if (this.anInt524 > this.anInt519) {
					local48 = new Class1_Sub38(arg0, this.anInt519);
					this.anInt519++;
				} else {
					@Pc(79) Class1_Sub38 local79 = (Class1_Sub38) this.aClass181_5.method4110();
					local48 = new Class1_Sub38(arg0, local79.anInt5850);
					this.aClass1_Sub38Array1[local79.anInt5853] = null;
					local79.method6020();
				}
				this.aClass1_Sub38Array1[arg0] = local48;
			} else {
				this.aBoolean17 = false;
			}
			this.aClass181_5.method4106(local48);
			return this.anIntArrayArray4[local48.anInt5850];
		}
	}
}
