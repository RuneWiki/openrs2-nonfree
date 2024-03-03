import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vp")
public final class Class240 {

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_252 = new Class145(65, 4);

	@OriginalMember(owner = "client!vp", name = "k", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_253 = new Class145(6, 15);

	@OriginalMember(owner = "client!vp", name = "m", descriptor = "Lclient!h;")
	public static final Class89 aClass89_245 = new Class89(5, 8);

	@OriginalMember(owner = "client!vp", name = "c", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!vp", name = "d", descriptor = "Ljava/lang/String;")
	public String aString69;

	@OriginalMember(owner = "client!vp", name = "l", descriptor = "I")
	public int anInt7010;

	@OriginalMember(owner = "client!vp", name = "j", descriptor = "Z")
	public boolean aBoolean476 = true;

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(Lclient!bt;I)V", line = 69)
	public void method6262(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4816();
			if (local5 == 0) {
				return;
			}
			this.method6265(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)Z", line = 122)
	public boolean method6264() {
		return this.aChar5 == 's';
	}

	@OriginalMember(owner = "client!vp", name = "a", descriptor = "(IILclient!bt;)V", line = 133)
	private void method6265(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub4 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static74.method5699(arg1.method4826());
		} else if (arg0 == 2) {
			this.anInt7010 = arg1.method4837();
		} else if (arg0 == 4) {
			this.aBoolean476 = false;
		} else if (arg0 == 5) {
			this.aString69 = arg1.method4810();
		}
	}
}
