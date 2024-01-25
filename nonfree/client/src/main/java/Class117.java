import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class117 {

	@OriginalMember(owner = "client!im", name = "l", descriptor = "I")
	private int anInt2857 = 0;

	@OriginalMember(owner = "client!im", name = "h", descriptor = "I")
	private int anInt2855 = -1;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "Lclient!vp;")
	private Class254 aClass254_18 = new Class254();

	@OriginalMember(owner = "client!im", name = "q", descriptor = "Z")
	public boolean aBoolean221 = false;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "I")
	private final int anInt2854;

	@OriginalMember(owner = "client!im", name = "p", descriptor = "I")
	private final int anInt2860;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "[[[I")
	private int[][][] anIntArrayArrayArray3;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "[Lclient!pk;")
	private Class1_Sub32[] aClass1_Sub32Array1;

	static {
		new Class151("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!im", name = "<init>", descriptor = "(III)V")
	public Class117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2854 = arg1;
		this.anInt2860 = arg0;
		this.anIntArrayArrayArray3 = new int[this.anInt2860][3][arg2];
		this.aClass1_Sub32Array1 = new Class1_Sub32[this.anInt2854];
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(I)[[[I")
	public int[][][] method2344() {
		if (this.anInt2854 != this.anInt2860) {
			throw new RuntimeException("Can only retrieve a full image cache");
		}
		for (@Pc(27) int local27 = 0; local27 < this.anInt2860; local27++) {
			this.aClass1_Sub32Array1[local27] = Static146.aClass1_Sub32_5;
		}
		return this.anIntArrayArrayArray3;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(II)[[I")
	public int[][] method2345(@OriginalArg(1) int arg0) {
		if (this.anInt2860 == this.anInt2854) {
			this.aBoolean221 = this.aClass1_Sub32Array1[arg0] == null;
			this.aClass1_Sub32Array1[arg0] = Static146.aClass1_Sub32_5;
			return this.anIntArrayArrayArray3[arg0];
		} else if (this.anInt2860 == 1) {
			this.aBoolean221 = this.anInt2855 != arg0;
			this.anInt2855 = arg0;
			return this.anIntArrayArrayArray3[0];
		} else {
			@Pc(50) Class1_Sub32 local50 = this.aClass1_Sub32Array1[arg0];
			if (local50 == null) {
				this.aBoolean221 = true;
				if (this.anInt2857 >= this.anInt2860) {
					@Pc(71) Class1_Sub32 local71 = (Class1_Sub32) this.aClass254_18.method5439();
					local50 = new Class1_Sub32(arg0, local71.anInt5166);
					this.aClass1_Sub32Array1[local71.anInt5167] = null;
					local71.method5617();
				} else {
					local50 = new Class1_Sub32(arg0, this.anInt2857);
					this.anInt2857++;
				}
				this.aClass1_Sub32Array1[arg0] = local50;
			} else {
				this.aBoolean221 = false;
			}
			this.aClass254_18.method5440(local50);
			return this.anIntArrayArrayArray3[local50.anInt5166];
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(B)V")
	public void method2346() {
		for (@Pc(3) int local3 = 0; local3 < this.anInt2860; local3++) {
			this.anIntArrayArrayArray3[local3][0] = null;
			this.anIntArrayArrayArray3[local3][1] = null;
			this.anIntArrayArrayArray3[local3][2] = null;
			this.anIntArrayArrayArray3[local3] = null;
		}
		this.aClass1_Sub32Array1 = null;
		this.anIntArrayArrayArray3 = null;
		this.aClass254_18.method5438();
		this.aClass254_18 = null;
	}
}
