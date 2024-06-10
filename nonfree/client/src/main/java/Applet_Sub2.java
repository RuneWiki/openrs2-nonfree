import java.applet.Applet;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Font;
import java.awt.Label;
import java.awt.LayoutManager;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.security.SecureRandom;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!passwordapp_de")
public final class Applet_Sub2 extends Applet implements ActionListener, KeyListener, TextListener, Runnable {

	@OriginalMember(owner = "client!passwordapp_de", name = "allowedlist", descriptor = "[Ljava/lang/String;")
	private static final String[] aStringArray3 = new String[] { "http://recovery_questions.runescape.com/", "http://webtestwip1.runescape.com:16304/", "http://webtestrc1.runescape.com:16304/", "http://local.runescape.com:16304/" };

	@OriginalMember(owner = "client!passwordapp_de", name = "codebase", descriptor = "Ljava/lang/String;")
	private String aString3;

	@OriginalMember(owner = "client!passwordapp_de", name = "norecovcheck", descriptor = "Ljava/awt/Checkbox;")
	private Checkbox aCheckbox2;

	@OriginalMember(owner = "client!passwordapp_de", name = "password1", descriptor = "Ljava/awt/TextField;")
	private TextField aTextField2;

	@OriginalMember(owner = "client!passwordapp_de", name = "onreversepath", descriptor = "Z")
	private boolean aBoolean4;

	@OriginalMember(owner = "client!passwordapp_de", name = "hidepanel", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel15;

	@OriginalMember(owner = "client!passwordapp_de", name = "showpanel", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel16;

	@OriginalMember(owner = "client!passwordapp_de", name = "type", descriptor = "I")
	private int anInt10;

	@OriginalMember(owner = "client!passwordapp_de", name = "username", descriptor = "Ljava/lang/String;")
	private String aString4;

	@OriginalMember(owner = "client!passwordapp_de", name = "uid", descriptor = "I")
	private int anInt11;

	@OriginalMember(owner = "client!passwordapp_de", name = "processingpage", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel17;

	@OriginalMember(owner = "client!passwordapp_de", name = "system_error_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel18;

	@OriginalMember(owner = "client!passwordapp_de", name = "blocked_query_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel19;

	@OriginalMember(owner = "client!passwordapp_de", name = "blocked_attack_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel20;

	@OriginalMember(owner = "client!passwordapp_de", name = "wrongpassword_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel21;

	@OriginalMember(owner = "client!passwordapp_de", name = "change_questions_success_page_active", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel22;

	@OriginalMember(owner = "client!passwordapp_de", name = "change_questions_success_page_pending", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel23;

	@OriginalMember(owner = "client!passwordapp_de", name = "change_questions_tooshort_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel24;

	@OriginalMember(owner = "client!passwordapp_de", name = "change_questions_samequestions_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel25;

	@OriginalMember(owner = "client!passwordapp_de", name = "change_questions_sameanswers_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel26;

	@OriginalMember(owner = "client!passwordapp_de", name = "change_questions_qandamatch_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel27;

	@OriginalMember(owner = "client!passwordapp_de", name = "change_questions_page", descriptor = "Ljava/awt/Panel;")
	private Panel aPanel28;

	@OriginalMember(owner = "client!passwordapp_de", name = "debug_panel", descriptor = "I")
	private int anInt12;

	@OriginalMember(owner = "client!passwordapp_de", name = "question", descriptor = "[Ljava/awt/TextField;")
	private TextField[] aTextFieldArray3;

	@OriginalMember(owner = "client!passwordapp_de", name = "recov", descriptor = "[Ljava/awt/TextField;")
	private TextField[] aTextFieldArray4;

	@OriginalMember(owner = "client!passwordapp_de", name = "key_e", descriptor = "Ljava/math/BigInteger;")
	private BigInteger aBigInteger3;

	@OriginalMember(owner = "client!passwordapp_de", name = "key_n", descriptor = "Ljava/math/BigInteger;")
	private BigInteger aBigInteger4;

	@OriginalMember(owner = "client!passwordapp_de", name = "example_questions", descriptor = "[Ljava/lang/String;")
	private String[] aStringArray4;

	@OriginalMember(owner = "client!passwordapp_de", name = "initialised", descriptor = "Z")
	private boolean aBoolean5;

	@OriginalMember(owner = "client!passwordapp_de", name = "init", descriptor = "()V", line = 68)
	@Override
	public void init() {
		System.out.println("Version: 3 DE");
		@Pc(7) Thread local7 = new Thread(this);
		local7.setDaemon(true);
		local7.start();
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "init_messages", descriptor = "()V", line = 75)
	private void method48() {
		this.aPanel17 = new Panel(null);
		this.aPanel17.setSize(this.getSize());
		@Pc(22) Label local22 = this.method50("Ihre Anfrage wird bearbeitet.", 180, this.getSize().height / 2 - 10);
		local22.setFont(new Font("Arial", 1, 13));
		this.aPanel17.add(local22);
		this.aPanel17.setVisible(false);
		this.add(this.aPanel17);
		this.aPanel22 = new Panel(null);
		this.aPanel22.setSize(this.getSize());
		this.aPanel22.add(this.method50("Ihre Sicherheitsfragen und -antworten sind auf dem neuesten", 30, this.getSize().height / 2 - 10));
		this.aPanel22.add(this.method50("Stand und aktiviert worden. ", 30, this.getSize().height / 2 + 10));
		this.aPanel22.setVisible(false);
		this.add(this.aPanel22);
		this.aPanel23 = new Panel(null);
		this.aPanel23.setSize(this.getSize());
		this.aPanel23.add(this.method50("Ihre Sicherheitsfragen und -antworten sind eingestellt worden.", 30, this.getSize().height / 2 - 10));
		this.aPanel23.add(this.method50("In 14 Tagen werden sie aktiviert.", 30, this.getSize().height / 2 + 10));
		this.aPanel23.setVisible(false);
		this.add(this.aPanel23);
		@Pc(152) int local152 = this.getSize().height / 2 - 50;
		this.aPanel18 = new Panel(null);
		this.aPanel18.setSize(this.getSize());
		@Pc(169) Label local169 = this.method50("Bei der Bearbeitung Ihrer Anfrage ist ein Fehler aufgetreten.", 55, local152);
		local169.setFont(new Font("Arial", 1, 13));
		this.aPanel18.add(local169);
		this.aPanel18.add(this.method50("Leider ist bei der Bearbeitung Ihrer Anfrage ein Fehler aufgetreten.", 55, local152 + 30));
		this.aPanel18.add(this.method50("Bitte versuchen Sie es später noch einmal.", 130, local152 + 50));
		@Pc(209) Button local209 = new Button("Gehen Sie zurück und versuchen Sie es erneut.");
		local209.setBounds(110, local152 + 80, 300, 22);
		local209.addActionListener(this);
		this.aPanel18.add(local209);
		this.aPanel18.setVisible(false);
		this.add(this.aPanel18);
		this.aPanel19 = new Panel(null);
		this.aPanel19.setSize(this.getSize());
		this.aPanel19.add(this.method50("Aufgrund vermehrter Probleme mit diesem Spielkonto ist es nicht mehr", 80, this.getSize().height / 2 - 20));
		this.aPanel19.add(this.method50("möglich, Passwort-Anfragen für dieses Spielkonto zu bearbeiten.", 95, this.getSize().height / 2));
		this.aPanel19.setVisible(false);
		this.add(this.aPanel19);
		this.aPanel20 = new Panel(null);
		this.aPanel20.setSize(this.getSize());
		this.aPanel20.add(this.method50("Aufgrund wiederholter Versuche von Ihrer IP-Adresse, das Passwort", 80, this.getSize().height / 2 - 40));
		this.aPanel20.add(this.method50("dieses Spielkontos zu ändern, wurde Ihre Anfrage abgelehnt.", 100, this.getSize().height / 2 - 20));
		this.aPanel20.add(this.method50("Bitte versuchen Sie es später noch einmal.", 150, this.getSize().height / 2));
		this.aPanel20.setVisible(false);
		this.add(this.aPanel20);
		@Pc(353) int local353 = this.getSize().height / 2 - 20;
		this.aPanel21 = new Panel(null);
		this.aPanel21.setSize(this.getSize());
		this.aPanel21.add(this.method50("Sie haben Ihr derzeitiges Passwort falsch eingegeben.", 90, local353));
		this.aPanel21.setVisible(false);
		@Pc(382) Button local382 = new Button("Zurück");
		local382.setBounds(150, local353 + 30, 200, 22);
		local382.addActionListener(this);
		this.aPanel21.add(local382);
		this.add(this.aPanel21);
		this.aPanel24 = new Panel(null);
		this.aPanel24.setSize(this.getSize());
		this.aPanel24.add(this.method50("Eine oder mehrere Ihrer Fragen oder Antworten", 110, 200));
		this.aPanel24.add(this.method50("waren zu kurz oder nicht vorhanden.", 145, 220));
		this.aPanel24.setVisible(false);
		@Pc(441) Button local441 = new Button("Zurück");
		local441.setBounds(150, 250, 200, 22);
		local441.addActionListener(this);
		this.aPanel24.add(local441);
		this.add(this.aPanel24);
		this.aPanel25 = new Panel(null);
		this.aPanel25.setSize(this.getSize());
		this.aPanel25.add(this.method50("Zwei oder mehr der von Ihnen eingestellten Fragen waren", 80, 200));
		this.aPanel25.add(this.method50("identisch. Bitte wählen Sie unterschiedliche Fragen.", 100, 220));
		this.aPanel25.setVisible(false);
		@Pc(498) Button local498 = new Button("Zurück");
		local498.setBounds(150, 250, 200, 22);
		local498.addActionListener(this);
		this.aPanel25.add(local498);
		this.add(this.aPanel25);
		this.aPanel26 = new Panel(null);
		this.aPanel26.setSize(this.getSize());
		this.aPanel26.add(this.method50("Zwei oder mehr der von Ihnen eingetragenen Antworten waren", 70, 200));
		this.aPanel26.add(this.method50("identisch. Bitte wählen Sie unterschiedliche Antworten.", 90, 220));
		this.aPanel26.setVisible(false);
		@Pc(555) Button local555 = new Button("Zurück");
		local555.setBounds(150, 250, 200, 22);
		local555.addActionListener(this);
		this.aPanel26.add(local555);
		this.add(this.aPanel26);
		this.aPanel27 = new Panel(null);
		this.aPanel27.setSize(this.getSize());
		this.aPanel27.add(this.method50("Eine oder mehrere Ihrer Fragen hat den gleichen Wortlaut", 120, 200));
		this.aPanel27.add(this.method50("wie eine der Antworten, die Sie angegeben haben.", 130, 220));
		this.aPanel27.add(this.method50("Bitte achten Sie darauf, dass die die Antworten", 130, 240));
		this.aPanel27.add(this.method50("nicht genauso wie die Fragen lauten.", 130, 260));
		this.aPanel27.setVisible(false);
		@Pc(630) Button local630 = new Button("Zurück");
		local630.setBounds(150, 290, 200, 22);
		local630.addActionListener(this);
		this.aPanel27.add(local630);
		this.add(this.aPanel27);
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "init_change_questions", descriptor = "()V", line = 196)
	private void method49() {
		this.aPanel28 = new Panel(null);
		this.aTextField2 = this.method52(20, 150, 0, 150, true);
		this.aTextFieldArray3[0] = this.method52(40, 100, 70, 250, false);
		this.aTextFieldArray3[0].setText(this.aStringArray4[0]);
		this.aTextFieldArray4[0] = this.method52(40, 100, 100, 250, true);
		this.aTextFieldArray3[1] = this.method52(40, 100, 170, 250, false);
		this.aTextFieldArray3[1].setText(this.aStringArray4[1]);
		this.aTextFieldArray4[1] = this.method52(40, 100, 200, 250, true);
		this.aTextFieldArray3[2] = this.method52(40, 100, 270, 250, false);
		this.aTextFieldArray3[2].setText(this.aStringArray4[2]);
		this.aTextFieldArray4[2] = this.method52(40, 100, 300, 250, true);
		this.aTextFieldArray3[3] = this.method52(40, 100, 370, 250, false);
		this.aTextFieldArray3[3].setText(this.aStringArray4[3]);
		this.aTextFieldArray4[3] = this.method52(40, 100, 400, 250, true);
		this.aTextFieldArray3[4] = this.method52(40, 100, 470, 250, false);
		this.aTextFieldArray3[4].setText(this.aStringArray4[4]);
		this.aTextFieldArray4[4] = this.method52(40, 100, 500, 250, true);
		this.aPanel28.setBackground(Color.black);
		this.aPanel28.add(this.method51("Momentanes Passwort:", 0, 0, 150));
		this.aPanel28.add(this.aTextField2);
		@Pc(209) Label local209 = this.method50("Sicherheitsfrage 1", 0, 40);
		local209.setFont(new Font("Arial", 1, 13));
		this.aPanel28.add(local209);
		this.aPanel28.add(this.method51("Frage:", 0, 70, 100));
		this.aPanel28.add(this.aTextFieldArray3[0]);
		@Pc(246) Button local246 = new Button("Neue Frage:");
		local246.setActionCommand("NEWRQ1");
		local246.setBounds(360, 70, 140, 22);
		local246.addActionListener(this);
		this.aPanel28.add(local246);
		this.aPanel28.add(this.method51("Antwort:", 0, 100, 100));
		this.aPanel28.add(this.aTextFieldArray4[0]);
		@Pc(288) Label local288 = this.method50("Sicherheitsfrage 2", 0, 140);
		local288.setFont(new Font("Arial", 1, 13));
		this.aPanel28.add(local288);
		this.aPanel28.add(this.method51("Frage:", 0, 170, 100));
		this.aPanel28.add(this.aTextFieldArray3[1]);
		@Pc(325) Button local325 = new Button("Neue Frage:");
		local325.setActionCommand("NEWRQ2");
		local325.setBounds(360, 170, 140, 22);
		local325.addActionListener(this);
		this.aPanel28.add(local325);
		this.aPanel28.add(this.method51("Antwort:", 0, 200, 100));
		this.aPanel28.add(this.aTextFieldArray4[1]);
		@Pc(367) Label local367 = this.method50("Sicherheitsfrage 3", 0, 240);
		local367.setFont(new Font("Arial", 1, 13));
		this.aPanel28.add(local367);
		this.aPanel28.add(this.method51("Frage:", 0, 270, 100));
		this.aPanel28.add(this.aTextFieldArray3[2]);
		@Pc(404) Button local404 = new Button("Neue Frage:");
		local404.setActionCommand("NEWRQ3");
		local404.setBounds(360, 270, 140, 22);
		local404.addActionListener(this);
		this.aPanel28.add(local404);
		this.aPanel28.add(this.method51("Antwort:", 0, 300, 100));
		this.aPanel28.add(this.aTextFieldArray4[2]);
		@Pc(446) Label local446 = this.method50("Sicherheitsfrage 4", 0, 340);
		local446.setFont(new Font("Arial", 1, 13));
		this.aPanel28.add(local446);
		this.aPanel28.add(this.method51("Frage:", 0, 370, 100));
		this.aPanel28.add(this.aTextFieldArray3[3]);
		@Pc(483) Button local483 = new Button("Neue Frage:");
		local483.setActionCommand("NEWRQ4");
		local483.setBounds(360, 370, 140, 22);
		local483.addActionListener(this);
		this.aPanel28.add(local483);
		this.aPanel28.add(this.method51("Antwort:", 0, 400, 100));
		this.aPanel28.add(this.aTextFieldArray4[3]);
		@Pc(525) Label local525 = this.method50("Sicherheitsfrage 5", 0, 440);
		local525.setFont(new Font("Arial", 1, 13));
		this.aPanel28.add(local525);
		this.aPanel28.add(this.method51("Frage:", 0, 470, 100));
		this.aPanel28.add(this.aTextFieldArray3[4]);
		@Pc(562) Button local562 = new Button("Neue Frage:");
		local562.setActionCommand("NEWRQ5");
		local562.setBounds(360, 470, 140, 22);
		local562.addActionListener(this);
		this.aPanel28.add(local562);
		this.aPanel28.add(this.method51("Antwort:", 0, 500, 100));
		this.aPanel28.add(this.aTextFieldArray4[4]);
		@Pc(603) Button local603 = new Button("Abschicken");
		local603.setBounds(150, 540, 200, 22);
		local603.addActionListener(this);
		this.aPanel28.add(local603);
		this.aPanel28.setSize(this.getSize());
		this.add(this.aPanel28);
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "getLabel", descriptor = "(Ljava/lang/String;II)Ljava/awt/Label;", line = 305)
	private Label method50(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return this.method51(arg0, arg1, arg2, arg0.length() * 8);
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "getLabel", descriptor = "(Ljava/lang/String;IIII)Ljava/awt/Label;", line = 312)
	private Label method51(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Label local5 = new Label(arg0, 0);
		local5.setForeground(Color.white);
		local5.setBackground(Color.black);
		local5.setFont(new Font("Arial", 0, 13));
		local5.setBounds(arg1, arg2, arg3, 20);
		return local5;
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "getTextField", descriptor = "(IIIIIZ)Ljava/awt/TextField;", line = 321)
	private TextField method52(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4) {
		@Pc(4) TextField local4 = new TextField(arg0);
		local4.setBounds(arg1, arg2, arg3, 20);
		if (arg4) {
			local4.setEchoChar('*');
		}
		local4.addTextListener(this);
		local4.addKeyListener(this);
		local4.setForeground(Color.black);
		local4.setBackground(Color.white);
		return local4;
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "safesizestring", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 336)
	private String method53(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		@Pc(2) String local2 = arg0.trim();
		return local2.length() > arg1 ? local2.substring(0, arg1) : local2;
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "actionPerformed", descriptor = "(Ljava/awt/event/ActionEvent;)V", line = 383)
	@Override
	public void actionPerformed(@OriginalArg(0) ActionEvent arg0) {
		if (this.aBoolean4) {
			if (this.aPanel15 != null) {
				this.aPanel15.setVisible(false);
				this.aPanel15 = null;
			}
			if (this.aPanel16 != null) {
				this.aPanel16.setVisible(true);
				this.aPanel16 = null;
			}
			this.aBoolean4 = false;
			return;
		}
		if (this.anInt10 == 2) {
			@Pc(33) String local33 = arg0.getActionCommand();
			if (local33 != null && local33.startsWith("NEWRQ")) {
				@Pc(50) String local50 = this.aStringArray4[(int) (Math.random() * (double) this.aStringArray4.length)];
				if (local33.equals("NEWRQ1")) {
					this.aTextFieldArray3[0].setText(local50);
					return;
				}
				if (local33.equals("NEWRQ2")) {
					this.aTextFieldArray3[1].setText(local50);
					return;
				}
				if (local33.equals("NEWRQ3")) {
					this.aTextFieldArray3[2].setText(local50);
					return;
				}
				if (local33.equals("NEWRQ4")) {
					this.aTextFieldArray3[3].setText(local50);
					return;
				}
				if (local33.equals("NEWRQ5")) {
					this.aTextFieldArray3[4].setText(local50);
				}
				return;
			}
			this.aPanel28.setVisible(false);
			if (this.aTextField2.getText().length() < 1 || this.aTextField2.getText().length() > 20) {
				this.aPanel21.setVisible(true);
				this.aBoolean4 = true;
				this.aPanel16 = this.aPanel28;
				this.aPanel15 = this.aPanel21;
				return;
			}
			@Pc(139) int local139 = 0;
			label142: while (true) {
				if (local139 >= 5) {
					@Pc(196) int local196;
					for (@Pc(180) int local180 = 0; local180 < 5; local180++) {
						@Pc(188) String local188 = this.aTextFieldArray3[local180].getText().trim();
						if (!local188.equals("")) {
							for (local196 = local180 + 1; local196 < 5; local196++) {
								if (local188.equalsIgnoreCase(this.aTextFieldArray3[local196].getText())) {
									this.aPanel25.setVisible(true);
									this.aBoolean4 = true;
									this.aPanel16 = this.aPanel28;
									this.aPanel15 = this.aPanel25;
									return;
								}
							}
						}
					}
					for (@Pc(231) int local231 = 0; local231 < 5; local231++) {
						@Pc(240) String local240 = Static3.method54(this.aTextFieldArray4[local231].getText()).trim();
						if (!local240.equals("")) {
							for (@Pc(248) int local248 = local231 + 1; local248 < 5; local248++) {
								if (Static3.method54(local240).equalsIgnoreCase(Static3.method54(this.aTextFieldArray4[local248].getText()))) {
									this.aPanel26.setVisible(true);
									this.aBoolean4 = true;
									this.aPanel16 = this.aPanel28;
									this.aPanel15 = this.aPanel26;
									return;
								}
							}
						}
					}
					local196 = 0;
					while (true) {
						if (local196 >= 5) {
							break label142;
						}
						@Pc(294) String local294 = Static3.method54(this.aTextFieldArray4[local196].getText()).trim();
						if (!local294.equals("")) {
							for (@Pc(300) int local300 = 0; local300 < 5; local300++) {
								if (local294.equalsIgnoreCase(Static3.method54(this.aTextFieldArray3[local300].getText()))) {
									this.aPanel27.setVisible(true);
									this.aBoolean4 = true;
									this.aPanel16 = this.aPanel28;
									this.aPanel15 = this.aPanel27;
									return;
								}
							}
						}
						local196++;
					}
				}
				if (this.aTextFieldArray3[local139].getText().trim().length() < 3 || Static3.method54(this.aTextFieldArray4[local139].getText()).length() < 3) {
					this.aPanel24.setVisible(true);
					this.aBoolean4 = true;
					this.aPanel16 = this.aPanel28;
					this.aPanel15 = this.aPanel24;
					return;
				}
				local139++;
			}
		}
		this.aPanel17.setVisible(true);
		@Pc(343) Thread local343 = new Thread(this);
		local343.setDaemon(true);
		local343.start();
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "run", descriptor = "()V", line = 497)
	@Override
	public void run() {
		if (!this.aBoolean5) {
			this.aString3 = this.getCodeBase().toString();
			@Pc(9) boolean local9 = false;
			for (@Pc(11) int local11 = 0; local11 < aStringArray3.length; local11++) {
				if (this.aString3.startsWith(aStringArray3[local11])) {
					local9 = true;
					break;
				}
			}
			if (!local9) {
				this.aString3 = "http://recovery_questions.runescape.com/";
			}
			this.setLayout(null);
			this.setBackground(Color.black);
			this.method48();
			this.anInt10 = Integer.parseInt(this.getParameter("type"));
			this.aString4 = this.getParameter("username");
			this.anInt11 = Static3.method57(Static3.method56());
			if (this.anInt10 == 2) {
				this.method49();
			} else if (this.anInt10 == 4) {
				this.method49();
				this.addKeyListener(this);
			} else {
				throw new RuntimeException("Not enough parameters");
			}
			this.aBoolean5 = true;
			return;
		}
		@Pc(85) SecureRandom local85 = new SecureRandom();
		@Pc(88) int[] local88 = new int[4];
		for (@Pc(90) int local90 = 0; local90 < local88.length; local90++) {
			local88[local90] = local85.nextInt();
		}
		@Pc(107) Class1 local107 = new Class1(new byte[66]);
		local107.method1(1);
		for (@Pc(112) int local112 = 0; local112 < local88.length; local112++) {
			local107.method5(local88[local112]);
		}
		local107.method34(this.aBigInteger3, this.aBigInteger4);
		@Pc(132) int local132 = local107.anInt1;
		local107.anInt1 = 0;
		@Pc(139) String local139 = local107.method37(local132);
		@Pc(145) Class1 local145 = new Class1(new byte[2048]);
		local145.method5(2);
		local145.method8(this.aString4);
		local145.method5(this.anInt11);
		if (this.anInt10 != 2) {
			return;
		}
		local145.method8(this.method53(this.aTextField2.getText(), 20));
		local145.method8(this.method53(this.aTextFieldArray3[0].getText(), 40));
		local145.method8(this.method53(Static3.method54(this.aTextFieldArray4[0].getText()), 40));
		local145.method8(this.method53(this.aTextFieldArray3[1].getText(), 40));
		local145.method8(this.method53(Static3.method54(this.aTextFieldArray4[1].getText()), 40));
		local145.method8(this.method53(this.aTextFieldArray3[2].getText(), 40));
		local145.method8(this.method53(Static3.method54(this.aTextFieldArray4[2].getText()), 40));
		local145.method8(this.method53(this.aTextFieldArray3[3].getText(), 40));
		local145.method8(this.method53(Static3.method54(this.aTextFieldArray4[3].getText()), 40));
		local145.method8(this.method53(this.aTextFieldArray3[4].getText(), 40));
		local145.method8(this.method53(Static3.method54(this.aTextFieldArray4[4].getText()), 40));
		@Pc(275) String local275 = "changequestions.cgi";
		local145.method36();
		@Pc(282) int local282 = local145.anInt1;
		local145.method32(local88);
		local145.anInt1 = 0;
		@Pc(292) String local292 = local145.method37(local282);
		@Pc(302) String local302 = this.aString3 + local275;
		try {
			@Pc(308) URL local308 = new URL(local302);
			@Pc(311) URLConnection local311 = local308.openConnection();
			local311.setDoInput(true);
			local311.setDoOutput(true);
			@Pc(323) OutputStreamWriter local323 = new OutputStreamWriter(local311.getOutputStream());
			local323.write("data1=" + Static3.method55(local139) + "&data2=" + Static3.method55(local292));
			local323.flush();
			@Pc(343) InputStream local343 = local311.getInputStream();
			local145.anInt1 = 0;
			while (local145.anInt1 < local145.aByteArray1.length && local343.read(local145.aByteArray1, local145.anInt1, local145.aByteArray1.length - local145.anInt1) != -1) {
			}
			local145.anInt1 = 0;
			local323.close();
			local343.close();
			@Pc(378) String local378 = local145.method26();
			this.aPanel17.setVisible(false);
			if (local378.startsWith("ATTACK")) {
				this.aPanel20.setVisible(true);
				return;
			}
			if (this.anInt10 == 2) {
				if (local378.startsWith("PENDING")) {
					this.aPanel23.setVisible(true);
					return;
				}
				if (local378.startsWith("ACTIVE")) {
					this.aPanel22.setVisible(true);
					return;
				}
				if (local378.startsWith("WRONG")) {
					this.aPanel21.setVisible(true);
					this.aBoolean4 = true;
					this.aPanel16 = this.aPanel28;
					this.aPanel15 = this.aPanel21;
					return;
				}
				this.aPanel18.setVisible(true);
				this.aBoolean4 = true;
				this.aPanel16 = this.aPanel28;
				this.aPanel15 = this.aPanel18;
				return;
			}
		} catch (@Pc(450) Throwable local450) {
			local450.printStackTrace();
			this.aPanel17.setVisible(false);
			this.aPanel18.setVisible(true);
			this.aBoolean4 = true;
			this.aPanel15 = this.aPanel18;
			if (this.anInt10 == 2) {
				this.aPanel16 = this.aPanel28;
			}
		}
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 635)
	@Override
	public void keyReleased(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 638)
	@Override
	public void keyTyped(@OriginalArg(0) KeyEvent arg0) {
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 645)
	@Override
	public void keyPressed(@OriginalArg(0) KeyEvent arg0) {
		@Pc(2) int local2 = arg0.getKeyCode();
		if (this.anInt10 == 4) {
			@Pc(8) boolean local8 = false;
			if (local2 == 37) {
				this.anInt12 = this.anInt12-- % 28;
				local8 = true;
			} else if (local2 == 39) {
				this.anInt12++;
				local8 = true;
			}
			if (local8) {
				this.aPanel17.setVisible(false);
				this.aPanel18.setVisible(false);
				this.aPanel19.setVisible(false);
				this.aPanel20.setVisible(false);
				this.aPanel21.setVisible(false);
				this.aPanel24.setVisible(false);
				this.aPanel25.setVisible(false);
				this.aPanel26.setVisible(false);
				this.aPanel28.setVisible(false);
				switch(this.anInt12) {
					case 0:
						this.aPanel17.setVisible(true);
						break;
					case 1:
						this.aPanel18.setVisible(true);
						break;
					case 2:
						this.aPanel19.setVisible(true);
						break;
					case 3:
						this.aPanel20.setVisible(true);
						break;
					case 4:
						this.aPanel21.setVisible(true);
						break;
					case 5:
						this.aPanel24.setVisible(true);
						break;
					case 6:
						this.aPanel25.setVisible(true);
						break;
					case 7:
						this.aPanel26.setVisible(true);
						break;
					case 8:
						this.aPanel28.setVisible(true);
				}
				this.validate();
				arg0.consume();
				return;
			}
			System.out.println("Didn't call change_panel!");
		}
		if (local2 == 8 || local2 == 127 || arg0.isActionKey() || (arg0.getModifiers() & 0x2) != 0 || (arg0.getModifiers() & 0x8) != 0) {
			return;
		}
		@Pc(153) Object local153 = arg0.getSource();
		if (local153 instanceof TextField) {
			@Pc(159) TextField local159 = (TextField) local153;
			if (local159.getText().length() >= local159.getColumns() && local159.getSelectedText().equals("")) {
				arg0.consume();
				return;
			}
		} else if (local153 instanceof TextArea) {
			@Pc(179) TextArea local179 = (TextArea) local153;
			if (local179.getText().length() >= 400 && local179.getSelectedText().equals("")) {
				arg0.consume();
			}
		}
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "textValueChanged", descriptor = "(Ljava/awt/event/TextEvent;)V", line = 719)
	@Override
	public void textValueChanged(@OriginalArg(0) TextEvent arg0) {
		@Pc(2) Object local2 = arg0.getSource();
		if (local2 instanceof TextField) {
			@Pc(8) TextField local8 = (TextField) local2;
			if (local8.getText().length() > local8.getColumns()) {
				local8.setText(local8.getText().substring(0, local8.getColumns()));
				local8.setCaretPosition(local8.getColumns());
				return;
			}
		} else if (local2 instanceof TextArea) {
			@Pc(33) TextArea local33 = (TextArea) local2;
			if (local33.getText().length() > 400) {
				local33.setText(local33.getText().substring(0, 400));
				local33.setCaretPosition(400);
			}
		}
	}

	@OriginalMember(owner = "client!passwordapp_de", name = "destroy", descriptor = "()V", line = 736)
	@Override
	public void destroy() {
	}
}
