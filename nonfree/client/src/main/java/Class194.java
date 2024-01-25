import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kba")
public final class Class194 {

	@OriginalMember(owner = "client!kba", name = "c", descriptor = "I")
	public int anInt5223;

	@OriginalMember(owner = "client!kba", name = "d", descriptor = "I")
	public int anInt5224;

	@OriginalMember(owner = "client!kba", name = "e", descriptor = "I")
	public int anInt5225;

	@OriginalMember(owner = "client!kba", name = "g", descriptor = "I")
	private int anInt5226;

	@OriginalMember(owner = "client!kba", name = "h", descriptor = "I")
	private int anInt5227;

	@OriginalMember(owner = "client!kba", name = "i", descriptor = "I")
	private int anInt5228;

	@OriginalMember(owner = "client!kba", name = "j", descriptor = "I")
	private int anInt5229;

	@OriginalMember(owner = "client!kba", name = "k", descriptor = "I")
	private int anInt5230;

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "I")
	private int anInt5222 = 2;

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "[I")
	private int[] anIntArray408 = new int[2];

	@OriginalMember(owner = "client!kba", name = "f", descriptor = "[I")
	private int[] anIntArray409 = new int[2];

	@OriginalMember(owner = "client!kba", name = "<init>", descriptor = "()V")
	public Class194() {
		this.anIntArray408[0] = 0;
		this.anIntArray408[1] = 65535;
		this.anIntArray409[0] = 0;
		this.anIntArray409[1] = 65535;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "()V")
	public void method4364() {
		this.anInt5230 = 0;
		this.anInt5228 = 0;
		this.anInt5227 = 0;
		this.anInt5229 = 0;
		this.anInt5226 = 0;
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(Lclient!so;)V")
	public void method4365(@OriginalArg(0) Class14_Sub29 arg0) {
		this.anInt5223 = arg0.method5866();
		this.anInt5224 = arg0.method5878();
		this.anInt5225 = arg0.method5878();
		this.method4367(arg0);
	}

	@OriginalMember(owner = "client!kba", name = "a", descriptor = "(I)I")
	public int method4366(@OriginalArg(0) int arg0) {
		if (this.anInt5226 >= this.anInt5230) {
			this.anInt5229 = this.anIntArray409[this.anInt5228++] << 15;
			if (this.anInt5228 >= this.anInt5222) {
				this.anInt5228 = this.anInt5222 - 1;
			}
			this.anInt5230 = (int) ((double) this.anIntArray408[this.anInt5228] / 65536.0D * (double) arg0);
			if (this.anInt5230 > this.anInt5226) {
				this.anInt5227 = ((this.anIntArray409[this.anInt5228] << 15) - this.anInt5229) / (this.anInt5230 - this.anInt5226);
			}
		}
		this.anInt5229 += this.anInt5227;
		this.anInt5226++;
		return this.anInt5229 - this.anInt5227 >> 15;
	}

	@OriginalMember(owner = "client!kba", name = "b", descriptor = "(Lclient!so;)V")
	public void method4367(@OriginalArg(0) Class14_Sub29 arg0) {
		this.anInt5222 = arg0.method5866();
		this.anIntArray408 = new int[this.anInt5222];
		this.anIntArray409 = new int[this.anInt5222];
		for (@Pc(16) int local16 = 0; local16 < this.anInt5222; local16++) {
			this.anIntArray408[local16] = arg0.method5900();
			this.anIntArray409[local16] = arg0.method5900();
		}
	}
}
