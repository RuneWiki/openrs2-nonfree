import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class121_Sub1 extends Class121 {

	@OriginalMember(owner = "client!gl", name = "G", descriptor = "[I")
	private int[] anIntArray350;

	@OriginalMember(owner = "client!gl", name = "K", descriptor = "I")
	private int anInt3952;

	@OriginalMember(owner = "client!gl", name = "P", descriptor = "[[B")
	private final byte[][] aByteArrayArray14 = new byte[10][];

	@OriginalMember(owner = "client!gl", name = "O", descriptor = "Lclient!jp;")
	private final Class3_Sub25 aClass3_Sub25_3 = new Class3_Sub25((byte[]) null);

	@OriginalMember(owner = "client!gl", name = "S", descriptor = "Lclient!jp;")
	private final Class3_Sub25 aClass3_Sub25_4 = new Class3_Sub25((byte[]) null);

	@OriginalMember(owner = "client!gl", name = "R", descriptor = "Lclient!aj;")
	private final Class15 aClass15_57;

	@OriginalMember(owner = "client!gl", name = "N", descriptor = "I")
	private final int anInt3953;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(ILclient!aj;I)V")
	public Class121_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass15_57 = arg1;
		this.anInt3953 = arg2;
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V")
	public void method3618() {
		if (this.anIntArray350 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
			if (this.anIntArray350.length <= this.anInt3952 + local17) {
				return;
			}
			if (this.aByteArrayArray14[local17] == null && this.aClass15_57.method542(0, this.anIntArray350[this.anInt3952 + local17])) {
				this.aByteArrayArray14[local17] = this.aClass15_57.method517(0, this.anIntArray350[local17 + this.anInt3952]);
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([BB)I")
	@Override
	protected int method3607(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray350 == null) {
			if (!this.aClass15_57.method542(0, this.anInt3953)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass15_57.method517(0, this.anInt3953);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub25_4.anInt9765 = 0;
			this.aClass3_Sub25_4.aByteArray106 = local26;
			local46 = local26.length >> 1;
			this.anIntArray350 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray350[local52] = this.aClass3_Sub25_4.method8593();
			}
		}
		if (this.anIntArray350.length <= this.anInt3952) {
			return -1;
		}
		this.method3618();
		this.aClass3_Sub25_4.aByteArray106 = arg0;
		this.aClass3_Sub25_4.anInt9765 = 0;
		do {
			if (this.aClass3_Sub25_4.anInt9765 >= this.aClass3_Sub25_4.aByteArray106.length) {
				this.aClass3_Sub25_4.aByteArray106 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub25_3.aByteArray106 == null) {
				if (this.aByteArrayArray14[0] == null) {
					this.aClass3_Sub25_4.aByteArray106 = null;
					return this.aClass3_Sub25_4.anInt9765;
				}
				this.aClass3_Sub25_3.aByteArray106 = this.aByteArrayArray14[0];
			}
			@Pc(134) int local134 = this.aClass3_Sub25_4.aByteArray106.length - this.aClass3_Sub25_4.anInt9765;
			local46 = this.aClass3_Sub25_3.aByteArray106.length - this.aClass3_Sub25_3.anInt9765;
			if (local134 < local46) {
				this.aClass3_Sub25_3.method8623(this.aClass3_Sub25_4.anInt9765, local134, this.aClass3_Sub25_4.aByteArray106);
				this.aClass3_Sub25_4.aByteArray106 = null;
				return arg0.length;
			}
			this.aClass3_Sub25_4.method8637(this.aClass3_Sub25_3.aByteArray106, local46, this.aClass3_Sub25_3.anInt9765);
			this.aClass3_Sub25_3.aByteArray106 = null;
			this.aClass3_Sub25_3.anInt9765 = 0;
			this.anInt3952++;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray14[local52] = this.aByteArrayArray14[local52 + 1];
			}
			this.aByteArrayArray14[9] = null;
		} while (this.anIntArray350.length > this.anInt3952);
		this.aClass3_Sub25_4.aByteArray106 = null;
		return this.aClass3_Sub25_4.anInt9765;
	}
}
