import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public final class Class33_Sub26 extends Class33 {

	@OriginalMember(owner = "client!ur", name = "i", descriptor = "Ljava/lang/String;")
	public static final String aString102;

	@OriginalMember(owner = "client!ur", name = "s", descriptor = "Ljava/lang/String;")
	public static final String aString103;

	static {
		@Pc(3) String local3 = "Unknown";
		try {
			local3 = System.getProperty("java.vendor").toLowerCase();
		} catch (@Pc(9) Exception local9) {
		}
		local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("java.version").toLowerCase();
		} catch (@Pc(20) Exception local20) {
		}
		local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.name").toLowerCase();
		} catch (@Pc(31) Exception local31) {
		}
		aString102 = local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.arch").toLowerCase();
		} catch (@Pc(42) Exception local42) {
		}
		aString103 = local3.toLowerCase();
		local3 = "Unknown";
		try {
			local3 = System.getProperty("os.version").toLowerCase();
		} catch (@Pc(53) Exception local53) {
		}
		local3.toLowerCase();
		local3 = "~/";
		try {
			local3 = System.getProperty("user.home").toLowerCase();
		} catch (@Pc(64) Exception local64) {
		}
		new File(local3);
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(ILclient!wo;)V")
	public Class33_Sub26(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub49 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!wo;)V")
	public Class33_Sub26(@OriginalArg(0) Class2_Sub49 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(I)V")
	@Override
	public void method8710() {
		if (super.aClass2_Sub49_31.aClass33_Sub28_1.method8685() && !Static575.method7995(super.aClass2_Sub49_31.aClass33_Sub28_1.method8687())) {
			super.anInt10227 = 0;
		}
		if (super.anInt10227 < 0 || super.anInt10227 > 1) {
			super.anInt10227 = this.method8709();
		}
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(II)V")
	@Override
	protected void method8711(@OriginalArg(1) int arg0) {
		super.anInt10227 = arg0;
	}

	@OriginalMember(owner = "client!ur", name = "d", descriptor = "(I)Z")
	public boolean method8364() {
		return Static575.method7995(super.aClass2_Sub49_31.aClass33_Sub28_1.method8687());
	}

	@OriginalMember(owner = "client!ur", name = "c", descriptor = "(B)I")
	public int method8367() {
		return super.anInt10227;
	}

	@OriginalMember(owner = "client!ur", name = "a", descriptor = "(B)I")
	@Override
	protected int method8709() {
		return 0;
	}

	@OriginalMember(owner = "client!ur", name = "b", descriptor = "(II)I")
	@Override
	public int method8708(@OriginalArg(1) int arg0) {
		return Static575.method7995(super.aClass2_Sub49_31.aClass33_Sub28_1.method8687()) ? 1 : 3;
	}
}
