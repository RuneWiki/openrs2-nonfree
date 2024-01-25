import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ih")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!ih", name = "J", descriptor = "[I")
	private int[] anIntArray289;

	@OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
	private int anInt5176;

	@OriginalMember(owner = "client!ih", name = "P", descriptor = "[[B")
	private final byte[][] aByteArrayArray82 = new byte[10][];

	@OriginalMember(owner = "client!ih", name = "K", descriptor = "Lclient!ig;")
	private final Class8_Sub8 aClass8_Sub8_4 = new Class8_Sub8(null);

	@OriginalMember(owner = "client!ih", name = "R", descriptor = "Lclient!ig;")
	private final Class8_Sub8 aClass8_Sub8_5 = new Class8_Sub8(null);

	@OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
	private final int anInt5178;

	@OriginalMember(owner = "client!ih", name = "O", descriptor = "Lclient!oh;")
	private final Class237 aClass237_62;

	@OriginalMember(owner = "client!ih", name = "<init>", descriptor = "(ILclient!oh;I)V")
	public Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class237 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.anInt5178 = arg2;
		this.aClass237_62 = arg1;
	}

	@OriginalMember(owner = "client!ih", name = "g", descriptor = "(I)V")
	public void method4237() {
		if (this.anIntArray289 == null) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
			if (this.anIntArray289.length <= local15 + this.anInt5176) {
				return;
			}
			if (this.aByteArrayArray82[local15] == null && this.aClass237_62.method6326(this.anIntArray289[local15 + this.anInt5176], 0)) {
				this.aByteArrayArray82[local15] = this.aClass237_62.method6314(this.anIntArray289[this.anInt5176 + local15], 0);
			}
		}
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "([BB)I")
	@Override
	protected int method4233(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray289 == null) {
			if (!this.aClass237_62.method6326(this.anInt5178, 0)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass237_62.method6314(this.anInt5178, 0);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass8_Sub8_5.anInt10588 = 0;
			this.aClass8_Sub8_5.aByteArray107 = local26;
			local46 = local26.length >> 1;
			this.anIntArray289 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray289[local52] = this.aClass8_Sub8_5.method8578();
			}
		}
		if (this.anIntArray289.length <= this.anInt5176) {
			return -1;
		}
		this.method4237();
		this.aClass8_Sub8_5.anInt10588 = 0;
		this.aClass8_Sub8_5.aByteArray107 = arg0;
		do {
			if (this.aClass8_Sub8_5.anInt10588 >= this.aClass8_Sub8_5.aByteArray107.length) {
				this.aClass8_Sub8_5.aByteArray107 = null;
				return arg0.length;
			}
			if (this.aClass8_Sub8_4.aByteArray107 == null) {
				if (this.aByteArrayArray82[0] == null) {
					this.aClass8_Sub8_5.aByteArray107 = null;
					return this.aClass8_Sub8_5.anInt10588;
				}
				this.aClass8_Sub8_4.aByteArray107 = this.aByteArrayArray82[0];
			}
			@Pc(135) int local135 = this.aClass8_Sub8_5.aByteArray107.length - this.aClass8_Sub8_5.anInt10588;
			local46 = this.aClass8_Sub8_4.aByteArray107.length - this.aClass8_Sub8_4.anInt10588;
			if (local135 < local46) {
				this.aClass8_Sub8_4.method8563(this.aClass8_Sub8_5.anInt10588, this.aClass8_Sub8_5.aByteArray107, local135);
				this.aClass8_Sub8_5.aByteArray107 = null;
				return arg0.length;
			}
			this.aClass8_Sub8_5.method8532(local46, this.aClass8_Sub8_4.anInt10588, this.aClass8_Sub8_4.aByteArray107);
			this.anInt5176++;
			this.aClass8_Sub8_4.aByteArray107 = null;
			this.aClass8_Sub8_4.anInt10588 = 0;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray82[local52] = this.aByteArrayArray82[local52 + 1];
			}
			this.aByteArrayArray82[9] = null;
		} while (this.anInt5176 < this.anIntArray289.length);
		this.aClass8_Sub8_5.aByteArray107 = null;
		return this.aClass8_Sub8_5.anInt10588;
	}
}
