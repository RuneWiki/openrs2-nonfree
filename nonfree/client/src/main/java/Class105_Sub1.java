import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class105_Sub1 extends Class105 {

	@OriginalMember(owner = "client!fa", name = "M", descriptor = "I")
	private int anInt2663;

	@OriginalMember(owner = "client!fa", name = "P", descriptor = "[I")
	private int[] anIntArray194;

	@OriginalMember(owner = "client!fa", name = "N", descriptor = "[[B")
	private final byte[][] aByteArrayArray10 = new byte[10][];

	@OriginalMember(owner = "client!fa", name = "H", descriptor = "Lclient!es;")
	private final Class4_Sub11 aClass4_Sub11_3 = new Class4_Sub11((byte[]) null);

	@OriginalMember(owner = "client!fa", name = "S", descriptor = "Lclient!es;")
	private final Class4_Sub11 aClass4_Sub11_4 = new Class4_Sub11((byte[]) null);

	@OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
	private final int anInt2660;

	@OriginalMember(owner = "client!fa", name = "Q", descriptor = "Lclient!bt;")
	private final Class34 aClass34_32;

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(ILclient!bt;I)V")
	public Class105_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class34 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt2660 = arg2;
		this.aClass34_32 = arg1;
	}

	@OriginalMember(owner = "client!fa", name = "g", descriptor = "(I)V")
	public void method2539() {
		if (this.anIntArray194 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			if (this.anInt2663 + local15 >= this.anIntArray194.length) {
				return;
			}
			if (this.aByteArrayArray10[local15] == null && this.aClass34_32.method1245(0, this.anIntArray194[local15 + this.anInt2663])) {
				this.aByteArrayArray10[local15] = this.aClass34_32.method1239(this.anIntArray194[local15 + this.anInt2663], 0);
			}
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B[B)I")
	@Override
	protected int method2533(@OriginalArg(1) byte[] arg0) throws IOException {
		@Pc(51) int local51;
		@Pc(57) int local57;
		if (this.anIntArray194 == null) {
			if (!this.aClass34_32.method1245(0, this.anInt2660)) {
				return 0;
			}
			@Pc(31) byte[] local31 = this.aClass34_32.method1239(this.anInt2660, 0);
			if (local31 == null) {
				throw new IllegalStateException("");
			}
			this.aClass4_Sub11_4.anInt10466 = 0;
			this.aClass4_Sub11_4.aByteArray107 = local31;
			local51 = local31.length >> 1;
			this.anIntArray194 = new int[local51];
			for (local57 = 0; local57 < local51; local57++) {
				this.anIntArray194[local57] = this.aClass4_Sub11_4.method8859();
			}
		}
		if (this.anInt2663 >= this.anIntArray194.length) {
			return -1;
		}
		this.method2539();
		this.aClass4_Sub11_4.anInt10466 = 0;
		this.aClass4_Sub11_4.aByteArray107 = arg0;
		do {
			if (this.aClass4_Sub11_4.anInt10466 >= this.aClass4_Sub11_4.aByteArray107.length) {
				this.aClass4_Sub11_4.aByteArray107 = null;
				return arg0.length;
			}
			if (this.aClass4_Sub11_3.aByteArray107 == null) {
				if (this.aByteArrayArray10[0] == null) {
					this.aClass4_Sub11_4.aByteArray107 = null;
					return this.aClass4_Sub11_4.anInt10466;
				}
				this.aClass4_Sub11_3.aByteArray107 = this.aByteArrayArray10[0];
			}
			@Pc(134) int local134 = this.aClass4_Sub11_4.aByteArray107.length - this.aClass4_Sub11_4.anInt10466;
			local51 = this.aClass4_Sub11_3.aByteArray107.length - this.aClass4_Sub11_3.anInt10466;
			if (local51 > local134) {
				this.aClass4_Sub11_3.method8870(this.aClass4_Sub11_4.aByteArray107, this.aClass4_Sub11_4.anInt10466, local134);
				this.aClass4_Sub11_4.aByteArray107 = null;
				return arg0.length;
			}
			this.aClass4_Sub11_4.method8824(this.aClass4_Sub11_3.aByteArray107, local51, this.aClass4_Sub11_3.anInt10466);
			this.anInt2663++;
			this.aClass4_Sub11_3.anInt10466 = 0;
			this.aClass4_Sub11_3.aByteArray107 = null;
			for (local57 = 0; local57 < 9; local57++) {
				this.aByteArrayArray10[local57] = this.aByteArrayArray10[local57 + 1];
			}
			this.aByteArrayArray10[9] = null;
		} while (this.anInt2663 < this.anIntArray194.length);
		this.aClass4_Sub11_4.aByteArray107 = null;
		return this.aClass4_Sub11_4.anInt10466;
	}
}
