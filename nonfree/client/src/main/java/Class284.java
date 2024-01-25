import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pm")
public final class Class284 {

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
	public int anInt7421 = 0;

	@OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
	public int anInt7424 = 0;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "Lclient!qj;")
	private final Class295 aClass295_49 = new Class295(64);

	@OriginalMember(owner = "client!pm", name = "l", descriptor = "Lclient!hj;")
	private Interface11 anInterface11_1 = null;

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "Lclient!uq;")
	private final Class362 aClass362_102;

	@OriginalMember(owner = "client!pm", name = "e", descriptor = "Lclient!uq;")
	private final Class362 aClass362_103;

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILclient!uq;Lclient!uq;Lclient!hj;)V")
	public Class284(@OriginalArg(0) int arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(2) Class362 arg2, @OriginalArg(3) Interface11 arg3) {
		this.anInterface11_1 = arg3;
		this.aClass362_102 = arg1;
		this.aClass362_103 = arg2;
		if (this.aClass362_102 != null) {
			this.anInt7421 = this.aClass362_102.method8355(1);
		}
		if (this.aClass362_103 != null) {
			this.anInt7424 = this.aClass362_103.method8355(1);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)Lclient!rg;")
	public Class3_Sub5_Sub16 method6224(@OriginalArg(0) int arg0) {
		@Pc(19) Class3_Sub5_Sub16 local19 = (Class3_Sub5_Sub16) this.aClass295_49.method6470((long) arg0);
		if (local19 != null) {
			return local19;
		}
		@Pc(35) byte[] local35;
		if (arg0 < 32768) {
			local35 = this.aClass362_102.method8368(1, arg0);
		} else {
			local35 = this.aClass362_103.method8368(1, arg0 & 0x7FFF);
		}
		local19 = new Class3_Sub5_Sub16();
		local19.aClass284_2 = this;
		if (local35 != null) {
			local19.method6748(new Class3_Sub4(local35));
		}
		if (arg0 >= 32768) {
			local19.method6747();
		}
		this.aClass295_49.method6469((long) arg0, local19);
		return local19;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[ILclient!ed;J)Ljava/lang/String;")
	public String method6225(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class93 arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface11_1 != null) {
			@Pc(19) String local19 = this.anInterface11_1.method789(arg0, arg2, arg1);
			if (local19 != null) {
				return local19;
			}
		}
		return Long.toString(arg2);
	}
}
