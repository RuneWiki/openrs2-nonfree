import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rp")
public final class Class21_Sub24 extends Class21 {

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "Ljava/lang/String;")
	public static final String aString112;

	@OriginalMember(owner = "client!rp", name = "u", descriptor = "Ljava/lang/String;")
	public static final String aString111;

	static {
		@Pc(62) String local62 = "Unknown";
		try {
			local62 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(70) Exception local70) {
		}
		local62.toLowerCase();
		local62 = "Unknown";
		try {
			local62 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(85) Exception local85) {
		}
		local62.toLowerCase();
		local62 = "Unknown";
		try {
			local62 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(100) Exception local100) {
		}
		aString112 = local62.toLowerCase();
		local62 = "Unknown";
		try {
			local62 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(115) Exception local115) {
		}
		aString111 = local62.toLowerCase();
		local62 = "Unknown";
		try {
			local62 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(130) Exception local130) {
		}
		local62.toLowerCase();
		local62 = "~/";
		try {
			local62 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(145) Exception local145) {
		}
		new File(local62);
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(ILclient!eha;)V")
	public Class21_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!rp", name = "<init>", descriptor = "(Lclient!eha;)V")
	public Class21_Sub24(@OriginalArg(0) Class3_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!rp", name = "b", descriptor = "(I)I")
	public int method7393() {
		return super.anInt10876;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(I)V")
	@Override
	public void method9235() {
		super.anInt10876 = this.method9239();
	}

	@OriginalMember(owner = "client!rp", name = "d", descriptor = "(II)V")
	@Override
	protected void method9240(@OriginalArg(1) int arg0) {
		super.anInt10876 = arg0;
	}

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(II)I")
	@Override
	public int method9238(@OriginalArg(1) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(B)I")
	@Override
	protected int method9239() {
		return super.aClass3_Sub22_34.method2415() ? 1 : 0;
	}
}
