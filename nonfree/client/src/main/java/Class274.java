import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class274 implements Interface27 {

	@OriginalMember(owner = "client!pm", name = "k", descriptor = "Lclient!up;")
	private final Class355 aClass355_2;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "Lclient!kv;")
	private final Class196 aClass196_1;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!up;Lclient!kv;)V")
	public Class274(@OriginalArg(0) Class355 arg0, @OriginalArg(1) Class196 arg1) {
		this.aClass355_2 = arg0;
		this.aClass196_1 = arg1;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7759() {
		return this.aClass355_2.method8697();
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!da;IBIILjava/lang/String;)I")
	private int method6727(@OriginalArg(0) Class69 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) String arg3) {
		return arg0.method8853(arg3, 0, 0, (Class33[]) null, arg1 + 5, this.aClass196_1.anInt5424, 0, this.aClass196_1.anInt5417 - 10, this.aClass196_1.anInt5415 + -10, 0, 0, this.aClass196_1.anInt5421, (Class1) null, (int[]) null, arg2 + 5);
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	@Override
	public void method7758() {
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7760() {
		@Pc(16) Class43 local16 = this.aClass355_2.method8696(this.aClass196_1.anInt5418);
		if (local16 == null) {
			return;
		}
		@Pc(33) int local33 = this.aClass196_1.aClass356_7.method8711(this.aClass196_1.anInt5417, Static33.anInt10742) + this.aClass196_1.anInt5416;
		@Pc(48) int local48 = this.aClass196_1.aClass56_10.method1354(Static602.anInt9666, this.aClass196_1.anInt5415) + this.aClass196_1.anInt5423;
		if (this.aClass196_1.aBoolean394) {
			Static674.aClass13_22.method8511(local33, local48, this.aClass196_1.anInt5417, this.aClass196_1.anInt5415, this.aClass196_1.anInt5413, 0);
		}
		local48 += this.method6727(Static303.aClass69_6, local33, local48, local16.aString7) * 12;
		local48 += 8;
		if (this.aClass196_1.aBoolean394) {
			Static674.aClass13_22.method8523(local33, local48, local33 + this.aClass196_1.anInt5417 - 1, local48, this.aClass196_1.anInt5413, 0);
		}
		local48++;
		local48 += this.method6727(Static303.aClass69_6, local33, local48, local16.aString9) * 12;
		local48 += 5;
		@Pc(131) int local131 = local48 + this.method6727(Static303.aClass69_6, local33, local48, local16.aString8) * 12;
	}
}
