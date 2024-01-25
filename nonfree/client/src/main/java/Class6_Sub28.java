import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!in")
public final class Class6_Sub28 extends Class6 {

	@OriginalMember(owner = "client!in", name = "s", descriptor = "I")
	private final int anInt4730;

	@OriginalMember(owner = "client!in", name = "z", descriptor = "Z")
	private final boolean aBoolean371;

	@OriginalMember(owner = "client!in", name = "m", descriptor = "I")
	private final int anInt4726;

	@OriginalMember(owner = "client!in", name = "A", descriptor = "I")
	private final int anInt4736;

	@OriginalMember(owner = "client!in", name = "t", descriptor = "I")
	private final int anInt4731;

	@OriginalMember(owner = "client!in", name = "C", descriptor = "Z")
	private final boolean aBoolean372;

	@OriginalMember(owner = "client!in", name = "y", descriptor = "I")
	private final int anInt4735;

	@OriginalMember(owner = "client!in", name = "p", descriptor = "I")
	private final int anInt4728;

	@OriginalMember(owner = "client!in", name = "r", descriptor = "I")
	private final int anInt4729;

	@OriginalMember(owner = "client!in", name = "x", descriptor = "I")
	private int anInt4734;

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(ZLclient!pe;)V")
	public Class6_Sub28(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class246 arg1) {
		if (Static389.aString89.startsWith("win")) {
			this.anInt4730 = 1;
		} else if (Static389.aString89.startsWith("mac")) {
			this.anInt4730 = 2;
		} else if (Static389.aString89.startsWith("linux")) {
			this.anInt4730 = 3;
		} else {
			this.anInt4730 = 4;
		}
		if (Static389.aString88.startsWith("amd64") || Static389.aString88.startsWith("x86_64")) {
			this.aBoolean371 = true;
		} else {
			this.aBoolean371 = false;
		}
		if (Static389.aString92.toLowerCase().indexOf("sun") != -1) {
			this.anInt4726 = 1;
		} else if (Static389.aString92.toLowerCase().indexOf("microsoft") != -1) {
			this.anInt4726 = 2;
		} else if (Static389.aString92.toLowerCase().indexOf("apple") == -1) {
			this.anInt4726 = 4;
		} else {
			this.anInt4726 = 3;
		}
		@Pc(91) int local91 = 2;
		@Pc(93) int local93 = 0;
		@Pc(99) char local99;
		try {
			while (local91 < Static389.aString91.length()) {
				local99 = Static389.aString91.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local93 = local99 + local93 * 10 - 48;
				local91++;
			}
		} catch (@Pc(129) Exception local129) {
		}
		this.anInt4736 = local93;
		local91 = Static389.aString91.indexOf(46, 2) + 1;
		local93 = 0;
		try {
			while (Static389.aString91.length() > local91) {
				local99 = Static389.aString91.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local91++;
				local93 = local99 + local93 * 10 - '0';
			}
		} catch (@Pc(169) Exception local169) {
		}
		this.anInt4731 = local93;
		local91 = Static389.aString91.indexOf(95, 4) + 1;
		local93 = 0;
		try {
			while (Static389.aString91.length() > local91) {
				local99 = Static389.aString91.charAt(local91);
				if (local99 < '0' || local99 > '9') {
					break;
				}
				local93 = local93 * 10 + local99 - 48;
				local91++;
			}
		} catch (@Pc(214) Exception local214) {
		}
		if (arg1.aBoolean534) {
			this.aBoolean372 = false;
		} else {
			this.aBoolean372 = true;
		}
		this.anInt4735 = Static205.anInt4372;
		if (this.anInt4736 <= 3) {
			this.anInt4728 = 0;
		} else {
			this.anInt4728 = Static293.anInt5603;
		}
		this.anInt4729 = local93;
		try {
			this.anInt4734 = (int) (jagmisc.getTotalPhysicalMemory() / 1024L / 1024L);
		} catch (@Pc(253) Throwable local253) {
			this.anInt4734 = 0;
		}
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(ZLclient!iaa;)V")
	public void method4065(@OriginalArg(1) Class6_Sub26 arg0) {
		arg0.method4950(2, -81849);
		arg0.method4950(this.anInt4730, -81849);
		arg0.method4950(this.aBoolean371 ? 1 : 0, -81849);
		arg0.method4950(this.anInt4726, -81849);
		arg0.method4950(this.anInt4736, -81849);
		arg0.method4950(this.anInt4731, -81849);
		arg0.method4950(this.anInt4729, -81849);
		arg0.method4950(this.aBoolean372 ? 1 : 0, -81849);
		arg0.method4962(this.anInt4735);
		arg0.method4950(this.anInt4728, -81849);
		arg0.method4937(this.anInt4734);
	}
}
