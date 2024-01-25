import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dg")
public final class Class2_Sub10_Sub2 extends Class2_Sub10 {

	@OriginalMember(owner = "client!dg", name = "v", descriptor = "Ljava/lang/String;")
	public static final String aString15;

	@OriginalMember(owner = "client!dg", name = "t", descriptor = "Ljava/lang/String;")
	public static final String aString14;

	@OriginalMember(owner = "client!dg", name = "w", descriptor = "B")
	private byte aByte47;

	@OriginalMember(owner = "client!dg", name = "u", descriptor = "I")
	private int anInt1843 = -1;

	static {
		@Pc(36) String local36 = "Unknown";
		try {
			local36 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(44) Exception local44) {
		}
		local36.toLowerCase();
		local36 = "Unknown";
		try {
			local36 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(59) Exception local59) {
		}
		local36.toLowerCase();
		local36 = "Unknown";
		try {
			local36 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(74) Exception local74) {
		}
		aString15 = local36.toLowerCase();
		local36 = "Unknown";
		try {
			local36 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(89) Exception local89) {
		}
		aString14 = local36.toLowerCase();
		local36 = "Unknown";
		try {
			local36 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(104) Exception local104) {
		}
		local36.toLowerCase();
		local36 = "~/";
		try {
			local36 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(119) Exception local119) {
		}
		new File(local36);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lclient!wc;Z)V")
	@Override
	public void method9198(@OriginalArg(0) Class394 arg0) {
		arg0.method9390(this.aByte47, this.anInt1843);
	}

	@OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZLclient!et;)V")
	@Override
	public void method9199(@OriginalArg(1) Class2_Sub20 arg0) {
		this.anInt1843 = arg0.method8575();
		this.aByte47 = arg0.method8536();
	}
}
