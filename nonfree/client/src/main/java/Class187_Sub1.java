import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mo")
public final class Class187_Sub1 extends Class187 {

	@OriginalMember(owner = "client!mo", name = "G", descriptor = "[I")
	private int[] anIntArray401;

	@OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
	private int anInt6905;

	@OriginalMember(owner = "client!mo", name = "M", descriptor = "[[B")
	private final byte[][] aByteArrayArray13 = new byte[10][];

	@OriginalMember(owner = "client!mo", name = "D", descriptor = "Lclient!tn;")
	private final Class3_Sub15 aClass3_Sub15_7 = new Class3_Sub15(null);

	@OriginalMember(owner = "client!mo", name = "P", descriptor = "Lclient!tn;")
	private final Class3_Sub15 aClass3_Sub15_8 = new Class3_Sub15(null);

	@OriginalMember(owner = "client!mo", name = "E", descriptor = "Lclient!kha;")
	private final Class181 aClass181_65;

	@OriginalMember(owner = "client!mo", name = "F", descriptor = "I")
	private final int anInt6901;

	@OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(ILclient!kha;I)V")
	public Class187_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) int arg2) {
		super(arg0);
		this.aClass181_65 = arg1;
		this.anInt6901 = arg2;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "([BB)I")
	@Override
	protected int method5776(@OriginalArg(0) byte[] arg0) throws IOException {
		@Pc(46) int local46;
		@Pc(52) int local52;
		if (this.anIntArray401 == null) {
			if (!this.aClass181_65.method5024(0, this.anInt6901)) {
				return 0;
			}
			@Pc(26) byte[] local26 = this.aClass181_65.method5023(this.anInt6901, 0);
			if (local26 == null) {
				throw new IllegalStateException("");
			}
			this.aClass3_Sub15_8.aByteArray106 = local26;
			this.aClass3_Sub15_8.anInt10282 = 0;
			local46 = local26.length >> 1;
			this.anIntArray401 = new int[local46];
			for (local52 = 0; local52 < local46; local52++) {
				this.anIntArray401[local52] = this.aClass3_Sub15_8.method8414();
			}
		}
		if (this.anIntArray401.length <= this.anInt6905) {
			return -1;
		}
		this.method5780();
		this.aClass3_Sub15_8.aByteArray106 = arg0;
		this.aClass3_Sub15_8.anInt10282 = 0;
		do {
			if (this.aClass3_Sub15_8.anInt10282 >= this.aClass3_Sub15_8.aByteArray106.length) {
				this.aClass3_Sub15_8.aByteArray106 = null;
				return arg0.length;
			}
			if (this.aClass3_Sub15_7.aByteArray106 == null) {
				if (this.aByteArrayArray13[0] == null) {
					this.aClass3_Sub15_8.aByteArray106 = null;
					return this.aClass3_Sub15_8.anInt10282;
				}
				this.aClass3_Sub15_7.aByteArray106 = this.aByteArrayArray13[0];
			}
			@Pc(130) int local130 = this.aClass3_Sub15_8.aByteArray106.length - this.aClass3_Sub15_8.anInt10282;
			local46 = this.aClass3_Sub15_7.aByteArray106.length - this.aClass3_Sub15_7.anInt10282;
			if (local46 > local130) {
				this.aClass3_Sub15_7.method8403(local130, this.aClass3_Sub15_8.anInt10282, this.aClass3_Sub15_8.aByteArray106);
				this.aClass3_Sub15_8.aByteArray106 = null;
				return arg0.length;
			}
			this.aClass3_Sub15_8.method8430(local46, this.aClass3_Sub15_7.anInt10282, this.aClass3_Sub15_7.aByteArray106);
			this.aClass3_Sub15_7.anInt10282 = 0;
			this.anInt6905++;
			this.aClass3_Sub15_7.aByteArray106 = null;
			for (local52 = 0; local52 < 9; local52++) {
				this.aByteArrayArray13[local52] = this.aByteArrayArray13[local52 + 1];
			}
			this.aByteArrayArray13[9] = null;
		} while (this.anInt6905 < this.anIntArray401.length);
		this.aClass3_Sub15_8.aByteArray106 = null;
		return this.aClass3_Sub15_8.anInt10282;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Z)V")
	public void method5780() {
		if (this.anIntArray401 == null) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < 10; local17++) {
			if (this.anInt6905 + local17 >= this.anIntArray401.length) {
				return;
			}
			if (this.aByteArrayArray13[local17] == null && this.aClass181_65.method5024(0, this.anIntArray401[local17 + this.anInt6905])) {
				this.aByteArrayArray13[local17] = this.aClass181_65.method5023(this.anIntArray401[local17 + this.anInt6905], 0);
			}
		}
	}
}
