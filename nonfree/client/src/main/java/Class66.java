import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class66 {

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
	public int anInt1681 = 0;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
	public int anInt1685 = 0;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "Lclient!eda;")
	private final Class87 aClass87_49 = new Class87(64);

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "Lclient!uf;")
	private Interface24 anInterface24_1 = null;

	@OriginalMember(owner = "client!cu", name = "d", descriptor = "Lclient!la;")
	private final Class207 aClass207_21;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "Lclient!la;")
	private final Class207 aClass207_22;

	@OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(ILclient!la;Lclient!la;Lclient!uf;)V")
	public Class66(@OriginalArg(0) int arg0, @OriginalArg(1) Class207 arg1, @OriginalArg(2) Class207 arg2, @OriginalArg(3) Interface24 arg3) {
		this.anInterface24_1 = arg3;
		this.aClass207_21 = arg2;
		this.aClass207_22 = arg1;
		if (this.aClass207_22 != null) {
			this.anInt1681 = this.aClass207_22.method4672(1);
		}
		if (this.aClass207_21 != null) {
			this.anInt1685 = this.aClass207_21.method4672(1);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)Lclient!mia;")
	public Class5_Sub5_Sub13 method1367(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub5_Sub13 local11 = (Class5_Sub5_Sub13) this.aClass87_49.method1805((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(27) byte[] local27;
		if (arg0 >= 32768) {
			local27 = this.aClass207_21.method4681(1, arg0 & 0x7FFF);
		} else {
			local27 = this.aClass207_22.method4681(1, arg0);
		}
		local11 = new Class5_Sub5_Sub13();
		local11.aClass66_1 = this;
		if (local27 != null) {
			local11.method5173(new Class5_Sub22(local27));
		}
		if (arg0 >= 32768) {
			local11.method5175();
		}
		this.aClass87_49.method1792((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "([IBLclient!ln;J)Ljava/lang/String;")
	public String method1369(@OriginalArg(0) int[] arg0, @OriginalArg(2) Class216 arg1, @OriginalArg(3) long arg2) {
		if (this.anInterface24_1 != null) {
			@Pc(20) String local20 = this.anInterface24_1.method8137(arg0, arg2, arg1);
			if (local20 != null) {
				return local20;
			}
		}
		return Long.toString(arg2);
	}
}
